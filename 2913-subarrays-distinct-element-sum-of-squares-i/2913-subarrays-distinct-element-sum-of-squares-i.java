class Solution {
    public int sumCounts(List<Integer> nums) {

     int tot = 0;
       for(int i = 0;i<nums.size();i++){

        for(int j = i;j<nums.size();j++){
             HashSet<Integer>h = new HashSet<>();
            for( int  k = i;k<=j;k++){

                int num =   nums.get(k);
                h.add(num);
            }

         int s = h.size();
         tot += (s*s);
        }
       } 

       return tot;
    }
}