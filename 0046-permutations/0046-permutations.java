class Solution {


    void swap( int  arr[] , int a , int b){
        
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }


     void   help( int arr[]  , int  idx , List<List<Integer>>aa   ){

        
        if( idx == arr.length){
            ArrayList<Integer>a = new ArrayList<>();
            for( int ele :  arr ){
                a.add(ele);
            }
            aa.add(a);
            return;
        }


        for( int  i  = idx;i<arr.length;i++){
            swap( arr, i , idx );
            help(arr , idx+1 ,aa);
            swap( arr, i , idx );
        }
     }
    public List<List<Integer>> permute(int[] arr) {


      List<List<Integer>>aa   = new ArrayList<>();


      help( arr , 0 , aa);


      return  aa;

    }

}