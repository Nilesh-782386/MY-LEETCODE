class Solution {
    public String mostCommonWord(String s, String[] banned) {
      s = s.toLowerCase();
        String sym = "!?',;.";
        // HashSet<Character>symbol =  new HashSet<>();
        HashSet<String>ban =  new HashSet<>();
        HashMap<String , Integer>freq =  new HashMap<>();

        for(int  i = 0;i<banned.length;i++){
            String ss = banned[i];
            ban.add(ss);
        }

        String arr[] = s.split("[^a-zA-Z]+");

       for( String sss   : arr){
        if(freq.containsKey(sss)){
            freq.put(sss, freq.get( sss)+1);
        }else{
              freq.put(sss, 1); 
        }
       }

       int  srt[] = new int[freq.size()];
       int k  = 0;
       for(String  kk : freq.keySet()){
        srt[k++] = freq.get(kk);
      }

      Arrays.sort(srt);
      

       
        for( int i =srt.length-1;i>=0;i--){
          int num = srt[i];
      for( String sss : freq.keySet()){
         int fr = freq.get(sss);

        if(fr == num && !ban.contains(sss)) return sss;
      }
    }
       
return "0";
        
    }
}
    