class Solution {
    public boolean isSubsequence(String s, String t) {

      int st = 0;
      int count =  0;
       for(int i = 0;i<s.length();i++){
    
       for( int j = st;j<t.length();j++){

        if(s.charAt(i) == t.charAt(j)){
           st = j+1;
           count++;
           break;
        }
        
       }
       } 

       return count == s.length();
    }
}