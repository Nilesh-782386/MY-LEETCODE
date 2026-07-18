class Solution {
    public int maxDepth(String s) {

      int tot = 0;
      int max = -1;

    for(char ch : s.toCharArray()){
        if(ch == '('){
            tot++;
        }
        if(ch == ')'){
            tot--;
        }
        max= Math.max( max , tot);

    }
    return  max;
    }
}