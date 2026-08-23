class Solution {
    int  totVol(   HashMap<Character,Integer>h ){

        int tot = 0;

        for( char ch : h.keySet()){
            tot+=h.get(ch);
        }
        return tot;
    }
    public int maxVowels(String s, int k) {

        int max = 0;
      HashMap<Character,Integer>h = new HashMap<>();

  h.put('a' , 0);
  h.put('e' , 0);
  h.put('i' , 0);
  h.put('o' , 0);
  h.put('u' , 0);
     int i = 0;
     int j =0;
     int n = s.length();
     while( j < n){
        char ch = s.charAt(j);
        
        if(h.containsKey(ch)){
            h.put(ch , h.get(ch)+1);
        }

            if(j-i+1 == k){
                 char chh = s.charAt(i);
                 max = Math.max(max , totVol(h));
                if(h.containsKey(chh)){

                h.put(chh , h.get(chh)-1);
                }
                i++;
            }
        j++;


      }
      return max;
    }
}