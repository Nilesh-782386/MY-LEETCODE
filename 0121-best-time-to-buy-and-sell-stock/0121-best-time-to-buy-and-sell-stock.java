class Solution {
    public int maxProfit(int[] prices) {

      int currMin = prices[0];
      int diff = Integer.MIN_VALUE;

      for(int i = 1;i<prices.length;i++){

        if(currMin > prices[i]){
            currMin = prices[i]; 
        }
        diff = Math.max( diff , prices[i]-currMin);
      }

      if( diff <0 ) return  0;

      return diff;
    }
}