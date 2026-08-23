class Solution {
    public int minimumRecolors(String s, int k) {

 int w = 0;
int i = 0;
int j = 0;
int n  = s.length();
int min = n;

while( j< n){
    char ch = s.charAt(j);

    if(ch == 'W'){
        w++;
    }

if( j-i+1 == k){
    min = Math.min( min , w);
    
    char chh = s.charAt(i);
    if(chh == 'W'){
        w--;
    }
    i++;
}
j++;
}
return min;
    }
}