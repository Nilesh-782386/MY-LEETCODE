class Solution {
    public int lengthOfLastWord(String s) {

     s = s.trim();
	 
	 String sep[] = s.split(" ");
	 
	 String p = sep[sep.length-1];
	 
     return p.length();




    }
}