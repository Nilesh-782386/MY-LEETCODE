class Solution {
    public String defangIPaddr(String str) {


  StringBuilder s = new StringBuilder("");
    for( int i =0;i<str.length();i++){

    char ch = str.charAt(i);

    if(ch == '.'){
         s.append('[');
         s.append('.');
         s.append(']');
    }else{
          s.append(ch);
    }
    }


    return s.toString();

    }
}