class Solution {
    public String[] createGrid(int m, int n) {
        
    
         String[][] arr =  new String[m][n];

        
         for(int r  = 0;r<m;r++){
           for(int c  = 0;c<n;c++){
            arr[r][c] = " ";
           }
         }

    int i = 0 , j = 0;


    for(i = 0;i<=m-1;i++){
        arr[i][j] = ".";
    }
    i--;
    for(j = 0;j<= n-1;j++){
        arr[i][j] = ".";
    }

    i = 0 ; j = 0;
    for(i = 0;i<=m-1;i++){
        for( j = 0;j<=n-1;j++){

           if(arr[i][j].equals(" "))  arr[i][j]  = "#";
        }
    }


     
     int totCol = m-1;


    String str[] = new String[m];

    int k = 0;



     StringBuilder sb = new StringBuilder();
    for(i = 0;i<=m-1;i++){
      StringBuilder temp = new StringBuilder();
        for( j = 0;j<=n-1;j++){

          temp.append(arr[i][j]);
         
        }
        //  if( i != totCol)temp.append(",");
        str[i] = temp.toString();
      }


     return  str;
    }
}