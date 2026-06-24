class Solution {
    int xor  = 0;
    public int xorOperation(int n, int start) {


      for( int i = 0;i<n;i++) {
        int tot = start+2*i;
        xor = xor^tot;
      } 

      return xor;
    }
}