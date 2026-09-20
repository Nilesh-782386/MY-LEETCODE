class Solution {
    public int reverseDegree(String s) {

      int tot = 0;

    int arr[] = new int[26];
    int st = 26;
    for(int  i  = 0;i<arr.length;i++){
        arr[i] = st;
        st--;
    }

    for( int  i  = 0;i<s.length();i++){
        int chPos = s.charAt(i)-'a';

         tot += (i+1) *arr[chPos];
    }

 return tot;
        
    }
}