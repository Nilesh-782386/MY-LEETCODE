class Solution {
    public double minimumAverage(int[] arr) {
 
    double ans = 999999.0;

    PriorityQueue<Integer>min = new PriorityQueue<>();
    PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());

    for(int i  : arr ){
        min.add(i);
        max.add(i);
    }

    // double  k  = 0;

    while(!max.isEmpty()){

      double avg = (double)(max.poll()+min.poll())/2;
      ans = Math.min(ans , avg);
    }

    return ans;

    }
}