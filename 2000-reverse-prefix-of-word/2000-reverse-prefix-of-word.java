class Solution {
    public String reversePrefix(String word, char ch) {
         StringBuilder a = new StringBuilder("");
       int i = 0;
     boolean flag = false;
    for( i = 0;i<word.length();i++){
        char cch = word.charAt(i);
         a.append(cch);
         if(cch == ch ){
            flag = true;
            break;
        }
    }
      StringBuilder b = new StringBuilder("");

    for( int k = i+1;k<word.length();k++){
       char cch = word.charAt(k);
         b.append(cch);  
    }

       if(flag) {
        a =  a.reverse();
       }

       a.append(b);

    String s = a.toString();

    return s;
    }
}