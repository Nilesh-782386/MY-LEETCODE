class Solution {



String  reverse( String s ){

 char[] arr = s.toCharArray();

int i = 0;
int j = arr.length - 1;

while (i < j) {
    char ch = arr[i];
    arr[i] = arr[j];
    arr[j] = ch;

    i++;
    j--;



}
 return new String(arr);

     }
    public String reverseWords(String s) {

 
     StringBuilder sb = new StringBuilder();
     String arr[]  = s.split(" ");

     for(int i = 0;i<arr.length;i++){
        String ss = arr[i];
        String rs =  reverse(ss);
        sb.append(rs);
       if(i != arr.length-1) sb.append(" ");

     }

     String ans = sb.toString();

     return ans;
    }
}
