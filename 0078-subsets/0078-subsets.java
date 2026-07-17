class Solution {
    public List<List<Integer>> subsets(int[] arr) {

       int n = arr.length;

       int size = 1<<n;
     List<List<Integer>>aa   = new ArrayList<>();
       for( int i = 0;i<size;i++){
        
        ArrayList<Integer>a   = new ArrayList<>();

        for( int  j = 0;j<n;j++){
            int num =  i>>j;
            if(num%2 != 0 ){
                a.add(arr[j]);
            }
        }
        aa.add(a);
       }

       return aa;
    }
}