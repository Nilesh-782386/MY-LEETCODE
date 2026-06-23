  public class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele , int freq){
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair p ){
        return  this.freq-p.freq;

    }



}
class Solution {

    public int[] topKFrequent(int[] arr, int k) {
     HashMap<Integer, Integer>m = new HashMap<>();
        int ans[] =  new int[k];
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        for(int i : arr){
            if(m.containsKey(i)){
                m.put(i , m.get(i)+1 );
            }else{
                m.put(i ,1);
            }
        }

        for(int i  : m.keySet()){
          int el = i;
          int freq = m.get(i);
          pq.add(new Pair(el , freq));
          if(pq.size() > k){
            pq.poll();
          }
        }

        int kk =0;
        while( !pq.isEmpty()){

            Pair  p  = pq.poll();
            ans[kk++] = p.ele;
        }
return ans;
    }
}