class Solution {
    public int lengthOfLongestSubstring(String s) {


       int max = 0;

       int j = 0;
       int i  = 0;
       int n = s.length();
       HashSet<Character>h = new HashSet<>();

       while(j < n ){

        char ch = s.charAt(j);

        if(h.contains(ch)){
           
            while(h.contains(ch)){
                 h.remove(s.charAt(i));
                 i++;
                
            }
            
        }

         h.add(ch);
          max = Math.max( max , h.size());
        
        j++;
       }

       return Math.max( max , h.size());
        
    }
}