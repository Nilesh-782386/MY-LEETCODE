class Solution {
    public int[] evenOddBit(int n) {

        int odd = 0;
        int even  = 0;
      
            for(int j = 0;j<32;j++){
                int  num = n>>j;
                if(num %2 != 0){
                    if(j%2 == 0 ){
                        even++;
                    }else{
                        odd++;
                    }
                }
            
        }

        return  new int[]{even, odd};
    }
}