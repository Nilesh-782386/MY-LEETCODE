class Pair  implements Comparable<Pair>{

    char chh;
    int freq;
    Pair( char ch , int freq){
        this.chh = ch;
        this.freq =freq;
    }

    public int compareTo(Pair p ){
        
      if(this.freq == p.freq)  return Character.compare(this.chh, p.chh);

      return this.freq-p.freq;
    }

}
class Solution {
   public static  String frequencySort(String s) {
    
    StringBuilder sb = new StringBuilder();

    HashMap<Character,Integer>h = new HashMap<>();

    for(int i = 0;i<s.length();i++){

        char ch = s.charAt(i);

        if(h.containsKey(ch)){
            h.put(ch, h.get(ch)+1);
        }else{
            h.put(ch, 1);
        }
    }
   PriorityQueue<Pair>pq = new PriorityQueue<>(Collections.reverseOrder());

    for(char ch : h.keySet()){
     int  fr = h.get(ch);
     pq.add( new Pair(ch , fr));
    }

     while (!pq.isEmpty()) {
        Pair p = pq.poll();
        int fr = p.freq;
        char  c = p.chh;

        while (fr > 0) {
            sb.append(c);
            fr--;
        }
     }

 

     String ss = sb.toString();

     return ss;

    }
}