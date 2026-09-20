class Solution {

    void   calFreq(int frq[] , int  num ){

        while( num  > 0 ){

            int k = num%10;
            frq[k]++;
            num = num/10;
        }
    }
    

    public int countDigitOccurrences(int[] arr, int dig) {

      int frq[] = new int[10];

      for(int  i =  0 ;i<arr.length;i++){
        int num = arr[i];

        calFreq(frq , num );
      }

      return frq[dig];
    }
}