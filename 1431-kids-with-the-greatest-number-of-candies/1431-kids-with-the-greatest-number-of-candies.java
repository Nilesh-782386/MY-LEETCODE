class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        ArrayList<Boolean>ans = new ArrayList<>();
        int max = -1;

        for( int i : candies){
            max = Math.max( max , i);
        }

        for( int i : candies){
            if(i+extraCandies < max){
                ans.add(false);
            }else{
                   ans.add(true);
            }
        }
        return ans;
    }
}