class Solution {


     private static boolean allValueZero(HashMap<Character,Integer> hm) {
  
    
    
    for(char ch : hm.keySet()){
      if(hm.get(ch) < 0 ) return false;
    }

    return  true;
  }


    public String minWindow(String s, String t) {
        

            HashMap<Character , Integer>hm = new HashMap<>();

    for( char ch : t.toCharArray()){

      hm.put( ch , hm.getOrDefault(ch , 0)-1);
    }

  int n = s.length();
  int m = t.length();

  int i = 0  , j  =0;
StringBuilder sb = new StringBuilder();



  while (j < n) {

  char ch = s.charAt(j);

  if(hm.containsKey(ch)){
    hm.put(ch, hm.get(ch)+1);

  }
  
  if(allValueZero(hm)){
    while (i < n && allValueZero(hm)) {
   StringBuilder sSb =  new StringBuilder();  

  
    if (sb.length() == 0 || j - i + 1 < sb.length()) {
        sb = new StringBuilder(s.substring(i, j + 1));
    }

   char chh = s.charAt(i);
   if(hm.containsKey(chh)){
    hm.put(chh, hm.get(chh)-1);

  }
  i++;
    }
  }
j++;

  }
  return sb.toString();
    }
}