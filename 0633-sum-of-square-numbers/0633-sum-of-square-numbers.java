class Solution {
    public boolean judgeSquareSum(int c) {
        
     int  num = (int)Math.sqrt(c)+1;

     if( c <= 2) return true;

      HashSet<Integer>h = new HashSet<>();

      for(int i = 0 ;i<= num ;i++){
        h.add(i*i);
      }

      for(int j = 0;j<num;j++){

       if(h.contains(c-(j*j))) return true;
      }

       return false;
      
          }
}