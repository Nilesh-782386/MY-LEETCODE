class Solution {
    public boolean judgeCircle(String moves) {



    int  count1 = 0;
    int  count2 = 0;
    for(int i = 0;i<moves.length();i++){

    char ch = moves.charAt(i);

    if(ch == 'U') count1++; 
    if(ch == 'D') count1--; 
    if(ch == 'R') count2++;
    if(ch == 'L') count2--; 
    }
    
    if( count1 == 0 && count2 == 0 ) return true;

    return false;
    }
}