class Solution {
     private String rev(String s) {
    
    int i = 0;
    int j = s.length()-1;

    char arr[] = s.toCharArray();
    while(i < j){
      
       char t = arr[i];
       arr[i] = arr[j];
        arr[j]=  t;
        i++;
        j--;
    
    }

    return  new String(arr);
  }
  
     public boolean isPalindrome(String s) {
s = s.replaceAll("[^a-zA-Z0-9]", "");

String s1 = s.toLowerCase();
String s2 = rev(s);
return s1.equals(s2.toLowerCase());
    }
 
}