class Solution {
    public int minimumPushes(String word) {
        

        int n = word.length();

        if(n  <= 8 ) return n;

        int tot = 0;

        for(int i = 8;i<word.length();i++){
            if(i < 8*2){
              tot +=2;
            }
            if(16 <= i && i < 24){
              tot +=3;
            }
            if(24 <= i ){
                tot +=4;
            }
        }

        return tot+(8);
    }
}