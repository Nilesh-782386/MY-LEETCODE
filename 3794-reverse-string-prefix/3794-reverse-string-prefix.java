class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder ss = new StringBuilder(s);

        StringBuilder  rev =   new StringBuilder(ss.substring(0 , k));
      return    rev.reverse()+ss.substring(k);
    }
}