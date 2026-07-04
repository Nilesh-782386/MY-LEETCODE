class Solution {

    int countFfreq(int n ){

        int count = 0;

        while(n>0){

            n = n&(n-1);
            count++;
        }

        return count;
    }
    class Pair implements Comparable<Pair>{
        int num;
        int freq;

        Pair(int num  , int freq){
            this.num = num;
            this.freq = freq;

        }

        public  int compareTo(Pair p ){
            if(this.freq == p.freq){
                return this.num -p.num;
            }
            return  this.freq-p.freq;
        }


    }


    public int[] sortByBits(int[] arr) {

      int ans[]  = new int[arr.length];

      HashMap<Integer,Integer>h = new HashMap<>();

      for( int  i = 0;i<arr.length;i++){
        int fr = countFfreq(arr[i]);
        h.put(arr[i] , fr);
      }

      PriorityQueue<Pair>p = new  PriorityQueue<>();

      for( int  i = 0;i<arr.length;i++){

        int  nn = arr[i];
        int f =  h.get(arr[i]);
       
        p.add(new Pair(nn , f));
      }

      int k = 0;

      while(!p.isEmpty()){

        Pair pp = p.poll();
        ans[k++] = pp.num;
      }


      return ans;
    }
}