class Solution {
    public int balancedStringSplit(String s) {
        

        char prev = s.charAt(0);

        int  count = 1;
        int tot = 0;
        for(int i =1;i<s.length();i++){

            char curr = s.charAt(i);

            if(prev  != curr){
                count--;
            }else{
                count++;
            }
            if( count == 0){

                prev = curr;
                tot++;

            }

        }

        return tot;
    }
}