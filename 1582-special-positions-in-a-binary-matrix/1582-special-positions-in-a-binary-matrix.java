class Solution {

     boolean isSpecialPos( int i   , int j  ,int[][] arr ){
       int countOnes =  0;
          int n = arr.length;   
          int m = arr[0].length; 
       int rw = i;
       int  cl = j;

       while(rw >= 0){
        if(arr[rw][cl] == 1)countOnes++;
        rw--;
       }

       rw = i;
       cl = j;

       while(rw  < n){
        if(arr[rw][cl] == 1)countOnes++;
        rw++;
       }
        rw = i;
       cl = j;


        while(cl >= 0){
        if(arr[rw][cl] == 1)countOnes++;
        cl--;
       }
       rw = i;
       cl = j;


       while(cl  < m){
        if(arr[rw][cl] == 1)countOnes++;
        cl++;
       }

    if( countOnes > 4 ) return false;

    return true;


     }
    public int numSpecial(int[][] mat) {

        int n = mat.length;   
        int m = mat[0].length;  
        int k = 0;

        for(int  i = 0;i<n;i++){
            for(int j = 0;j<m;j++){

                if(mat[i][j] == 1){
                  if(isSpecialPos(i , j , mat )){
                    k++;
                  }
                }
            }
        } 

        return k;
    }
}