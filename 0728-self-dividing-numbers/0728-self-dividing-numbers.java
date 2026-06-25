class Solution {

  boolean  divide( int n){
     int num = n;
       while(n > 0){
     int k = n%10;
     if(k == 0 ) return  false;
     if( num%k != 0 ) return false;
      n = n/10;
       }

       return true;
  }
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> a = new ArrayList<>();
        for( int i = left ;i<= right;i++){
            int num = i;
            if(num%10 == 0 ) continue;
            if(divide(num)){
                a.add(num);
            }
        }

        return a;
    }
}