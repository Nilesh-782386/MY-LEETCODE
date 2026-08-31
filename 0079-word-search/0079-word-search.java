class Solution {

    int dirs[][] =  {{1,0} , {0 , 1} , {0 ,-1  }  , {-1 , 0}};
  boolean    findComplete(char[][] board,  int  i , int  j ,  String s, int idx){

      
     int  r = board.length;
     int  c =  board[0].length; 


    if(  i  < 0  || j < 0  || i >=r || j >= c )  return false;


    if(board[i][j] == '$') return false;

    if(board[i][j] != s.charAt(idx)) return false;
    if(idx == s.length()-1) return true;

      char  temp = board[i][j];
      
      board[i][j] = '$';

     
     for(int  []rows  :  dirs){

        int newRow =   i+ rows[0];
         int newCol =  j+ rows[1];
     if(findComplete( board , newRow , newCol  , s ,idx+1))return true;
     }
     board[i][j] = temp;
     
     return  false;
    }
    public boolean exist(char[][] board, String s) {


    int  r = board.length;
    int  c =  board[0].length;


    for(int  i = 0;i <r;i++){
        for( int j = 0;j<c;j++){

            if(board[i][j] == s.charAt(0)){
           if(findComplete( board , i , j , s , 0 )) return true;
            }
        }
    }

    return false;
    }
}