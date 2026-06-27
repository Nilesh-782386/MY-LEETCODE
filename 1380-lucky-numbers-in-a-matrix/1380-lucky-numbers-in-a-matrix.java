class Solution {

    public List<Integer> luckyNumbers(int[][] arr) {
        
        List<Integer>a  =  new ArrayList<>();
        int max  = 0;
        int row[] = new int[arr.length];
        int col[] = new int[arr[0].length];

        for( int i = 0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int minn = Integer.MIN_VALUE;
            for(int j = 0;j<arr[0].length;j++){

                min = Math.min( min , arr[i][j]);
              
            }
            row[i] = min;
        }
        
         for( int j = 0;j<arr[0].length;j++){
            int minn = Integer.MIN_VALUE;

            for(int i = 0;i<arr.length;i++){
                minn = Math.max( minn , arr[i][j]);
              
            }

            col[j]  = minn;

        }



        for( int i  = 0;i<row.length;i++){
            for( int j = 0;j<col.length;j++){
                if(row[i] == col[j]){
                    a.add(row[i]);
                    break;
                }
            }
        }


    return a;


        
        
    }
}