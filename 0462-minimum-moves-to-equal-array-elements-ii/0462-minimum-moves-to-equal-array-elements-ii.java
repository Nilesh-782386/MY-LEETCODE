class Solution {
    public int minMoves2(int[] arr) {

    Arrays.sort(arr);
    int a1 = 0;
    int a2 = 0;
    int a3  = 0;

   if(arr.length%2 == 0 ){
        int mid = arr.length/2;
        int f = arr[mid-1];
        int s =  arr[mid];

    for(int i = 0;i<arr.length;i++){
       a1 += Math.abs(f -arr[i]);

     }
      for(int i = 0;i<arr.length;i++){
       a2 += Math.abs(s -arr[i]);

     }

    }else{
     int mid = arr.length/2;
     int num = arr[mid];

     for(int i = 0;i<arr.length;i++){
     a3 += Math.abs(num-arr[i]);

     }

    }


    if(arr.length%2 == 0 ) return Math.min( a1 , a2);

    return a3;
    }
}