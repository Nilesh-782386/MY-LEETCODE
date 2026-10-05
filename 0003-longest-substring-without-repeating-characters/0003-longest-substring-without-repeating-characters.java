class Solution {

    boolean checkAllFreq(HashMap<Character , Integer>h ){

    for(char ch : h.keySet()){

       if(h.get(ch) > 1)return false;
    }

 return true;
    }
    public int lengthOfLongestSubstring(String s) {

     
     HashMap<Character , Integer>h = new HashMap<>();
     int max = 0;
     int i = 0;
     int j = 0;
     int n = s.length();

     while(j < n){

    char ch  = s.charAt(j);

    h.put(ch , h.getOrDefault(ch ,0)+1);

    
    if(checkAllFreq(h)){
    
    max = Math.max(max, j-i+1);
    }else{

        while( i < n && !checkAllFreq(h)){

          char chh  = s.charAt(i);  
          h.put( chh , h.get(chh)-1) ;
          i++;
        }
    }
j++;
     } 

     return max;
    }
}