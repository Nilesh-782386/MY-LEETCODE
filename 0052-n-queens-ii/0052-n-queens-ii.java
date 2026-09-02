class Solution {
       private static boolean isSafePosition(int row  , int col, String[][] arr) {
        int i = row;
        int j = col;
        int n  = arr.length;
      for( int r = 0;r<n;r++){
        if(arr[row][r].equals("Q")){
           return false;
         } 
         }

         for( int r = 0;r<n;r++){
        if(arr[r][col].equals("Q")){
           return false;
         }
            
         }


          i = row;
          j  = col;

          while (i  < n  && j < n) {

        if(arr[i][j].equals("Q")){
           return false;
         }

         i++;
         j++;
         }
          i = row;
          j  = col;


        while (i   < n && j >=0 ) {
        if(arr[i][j].equals("Q")){
           return false;
         }

         i++;
         j--;
            
         }
         i = row;
         j  = col;


         while (i >= 0  && j < n ) {
         if(arr[i][j].equals("Q")){
           return false;
         }

         i--;
         j++;   
         }
i = row;
         j  = col;
while (i >= 0 && j >= 0) {

    if (arr[i][j].equals("Q")) {
        return false;
    }

    i--;
    j--;
}

       return true;
      }


      private static void help(String[][] arr, int row  , List<List<String>>aa ) {
      int n = arr.length;

      if(row == n){
        ArrayList<String>a  = new ArrayList<>();
    for( int i  = 0;i<n;i++){
        StringBuilder s =  new StringBuilder();
         for(int  j = 0;j<n;j++){

         s.append(arr[i][j]);
         }
          String ss = s.toString();
          a.add(ss);

      }
      aa.add(a);
      return ;
   }
         for(int  j = 0;j<n;j++){
            if(isSafePosition(row,j, arr )){
               arr[row][j] = "Q";
               help( arr , row+1 , aa);
               arr[row][j] = ".";
            }
      }

   }

    public int totalNQueens(int n) {

      String arr[][] = new String[n][n];
       List<List<String>>aa = new ArrayList<>(); 
       for (int i = 0; i < n; i++) { 
        Arrays.fill(arr[i], "."); }
         help(arr ,  0 , aa); 
         return aa.size();  
    }
}