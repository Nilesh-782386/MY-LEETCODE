class Solution {

    boolean help(int[][] arr , int i , int j  , int num) {
        int n  = arr.length;
    int end = n*n-1;
        if(num == n*n-1){
            return true;
        }

        //RRD
        if(j+2 < n && i+1 < n){
            if( arr[j+2][i+1]== num+1){
                return help(arr ,i+1 ,j+2 ,num+1);
            }
        }

        //RRU

         if(j+2 < n && i-1 >= 0){
            if( arr[j+2][i-1]== num+1){
                return help(arr ,i-1 ,j+2,num+1);
            }
        }


        //LLD

         if(j-2 >= 0   && i+1  < n){
            if( arr[j-2][i+1]== num+1){
                return help(arr ,i+1 , j-2,num+1);
            }
        }


        //LLU

          if(j-2 >= 0    && i-1 >=0 ){
            if( arr[j-2][i-1]== num+1){
                return help(arr ,i-1 , j-2,num+1);
            }
        }


        //DDR

          if(j+1 <n   && i+2 <n ){
            if( arr[j+1][i+2]== num+1){
                return help(arr ,i+2, j+1,num+1);
            }
        }


        //DDL
          if(j-1 >= 0  && i+2 < n ){
            if( arr[j-1][i+2]== num+1){
                return help(arr ,i+2 , j-1,num+1);
            }
        }


        //UUL

          if(j-1 >= 0  && i-2 >=0 ){
            if( arr[j-1][i-2]== num+1){
                return help(arr ,i-2 , j-1,num+1);
            }
        }


        //UUR

          if(j+1 <n    && i-2 >=0 ){
            if( arr[j+1][i-2]== num+1){
                return help(arr ,i-2 , j+1,num+1);
            }
        }
        return false;

    }
    public boolean checkValidGrid(int[][] arr) {

     int n  = arr.length;
     if(n  < 5 ) return false;
     
     int end = n*n-1;
     int stI = 0;
     int endJ = 0;

     for( int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
        if( arr[i][j] == 0){
            stI = i;
            endJ = j;
            break;
        }
        }
     }
     if(help(arr , stI ,endJ , 0)){
        return true;
     }
     return false;
    }
}