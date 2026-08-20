class Solution {
    public String longestCommonPrefix(String[] s) {


  int n  = s.length;
  String ss = "";
   int min = 3000;
   for(int i = 0;i<n;i++){

    
    if(s[i].length()  <  min){
        min = s[i].length();

        ss  = s[i];   
    }
   }
    int k = s.length;
    int count = 0;

    StringBuilder sb = new StringBuilder("");
    for(int i  = 0;i<ss.length();i++){
        count = 0;
     for(int j = 0;j<n;j++){
        String  ns = s[j];
        if(ss.charAt(i) == ns.charAt(i) ){
          count++;
        }
        
    }
    if(count != k ) return sb.toString();
    if( count == k ){
        sb.append(ss.charAt(i));
    }
    
    }
        return sb.toString();
}
}
