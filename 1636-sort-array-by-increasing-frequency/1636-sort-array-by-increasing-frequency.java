public class Pair implements Comparable<Pair>{
    int val;
    int freq;

    Pair(int val , int freq){
        this.val = val;
        this.freq = freq;
    }

    public  int compareTo(Pair p ){
        
        if(this.freq == p.freq){
            return p.val-this.val;

        }

        return this.freq-p.freq;
    }
}
class Solution {
    public int[] frequencySort(int[] arr) {
        
        HashMap<Integer,Integer>h = new HashMap<>();
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        int ans[] = new int[arr.length];

        for( int i : arr){
            h.put( i ,h.getOrDefault(i , 0)+1);
        }
        int k  =0;
        
       for( int keys : h.keySet()){

        int key  = keys;
        int val = h.get(keys);

        pq.add(new Pair(key , val));

        
       }
      while(!pq.isEmpty()){

    Pair p = pq.poll();

    while(p.freq > 0){
        ans[k++] = p.val;
        p.freq--;
    }
}
        

       return ans;



    }
}