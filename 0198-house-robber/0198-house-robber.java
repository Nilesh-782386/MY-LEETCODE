class Solution {

    int  maxMoney(int idx , int arr[] , int preAns[]){

       
        if(idx == arr.length-1 ) return arr[idx];

        if(idx == arr.length-2 ) return  Math.max( arr[idx] , arr[idx+1]);
        if( preAns[idx] != -1 ) return preAns[idx];
       int take =   arr[idx] +maxMoney( idx+2 , arr , preAns);
       int notTake = maxMoney( idx+1 , arr , preAns);

    return  preAns[idx] =  Math.max( take , notTake);
    }
    public int rob(int[] arr) {
        
     int preAns[] = new int[arr.length];
         Arrays.fill(preAns , -1 );
      return  maxMoney(0  , arr ,preAns);
         
    }
}