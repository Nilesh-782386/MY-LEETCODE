class Solution {

     void revRow(int arr[]){

        int i = 0;
        int j  = arr.length-1;

        while( i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
     }
    public int[][] flipAndInvertImage(int[][] arr) {


      for( int i = 0;i<arr.length;i++){
	    revRow(arr[i]);
	}

    int ans[][] = new int[arr.length][arr.length];

   for( int i = 0;i<arr.length;i++){
	    for( int j =0;j<arr[0].length;j++){
     if(arr[i][j] == 0 ){
        ans[i][j]= 1;
     }
     if(arr[i][j] == 1){
        ans[i][j]= 0; 
     }

	    }
        

    }
    return ans;
}

}