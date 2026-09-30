class Solution {
    public boolean checkZeroOnes(String s) {

      Stack<Character>st = new Stack<>();

      if(s.length() == 1){

        if(s.charAt(0) == '0') return false;
        return true;
      }
       int max_1 = 0;
       int max_0 = 0;

       for( int i = 0; i<s.length();i++){
        char ch = s.charAt(i);

        if(ch == '0'){
            // while(!s.isEmpty()) s.pop();
            st.clear();
            continue;
        }

        if(ch == '1'){

            while( i+1 < s.length() && s.charAt(i+1) == '1'){
               st.push( s.charAt(i+1));
               i++;
            }
            max_1 = Math.max( max_1 , st.size());
        }
       }

  st.clear();


        for( int i = 0; i<s.length();i++){
        char ch = s.charAt(i);

        if(ch == '1'){
            // while(!s.isEmpty()) s.pop();
            st.clear();
            continue;
        }

        if(ch == '0'){

            while( i+1 < s.length() && s.charAt(i+1) == '0'){
               st.push( s.charAt(i+1)) ;
               i++;
            }
            max_0 = Math.max( max_0, st.size());
        }
       }


       if( max_1  > max_0 ) return true;

       return false;
    }
}