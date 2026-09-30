class Solution {
    public int countKeyChanges(String s) {

        int count = 0;
      for(int i = 1;i<s.length();i++){

        char ch = s.charAt(i);
        char chh = s.charAt(i-1);
        int ascii_1 = (int)ch; 
        int ascii_2 = (int)chh; 
        if(ascii_1 == ascii_2) continue;
        if( (Math.abs(ascii_1-ascii_2)-32 != 0) )count++;


          }

        return count;
    }
}