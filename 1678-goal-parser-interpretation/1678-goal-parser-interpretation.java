class Solution {
    public String interpret(String s) {
        
        StringBuilder sb = new StringBuilder("");

        for( int i = 0;i<s.length();i++ ){

        char ch = s.charAt(i);

        if(ch == 'G'){
            sb.append("G");
        }else if( ch == '('){

         if(i != s.length()-1){
             char chh = s.charAt(i+1);
             if(chh ==  ')'){
            sb.append("o");
            i++;
             }else{
                sb.append("al"); 
                i +=3;
             }
         }



            
        }

        }
        return sb.toString();
    }
}
