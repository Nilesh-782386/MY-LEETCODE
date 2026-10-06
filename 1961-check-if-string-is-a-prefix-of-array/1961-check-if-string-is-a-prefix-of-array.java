class Solution {
    public boolean isPrefixString(String s, String[] words) {

      StringBuilder sb = new StringBuilder();

      boolean  flag =  false;

     
      for(String ss :  words){
        sb.append(ss);
        if(sb.length() == s.length()){
        flag = true;
      for( int  i = 0;i<s.length();i++){
        if(s.charAt(i) !=  sb.charAt(i)) return false;
      }
        }


      }
     

       return flag;

    }
}