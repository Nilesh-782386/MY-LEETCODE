class Solution {

     void  help(  List<String>ll  , int  left , int right ,int n  , StringBuilder sb ){

        if(sb.length() == 2*n){
            ll.add(sb.toString());
            return;
        }

        if(left < n ){
            sb.append("(");
            help( ll , left+1 , right  ,n , sb);
          sb.deleteCharAt(sb.length() - 1);  
        }
           if(right < left){
            sb.append(")");
             help( ll , left, right+1,n, sb);
             sb.deleteCharAt(sb.length() - 1);  
        }

     }
    public List<String> generateParenthesis(int n) {
        

     List<String>ll  = new ArrayList<>();

     help( ll , 0 , 0  , n  , new StringBuilder());
       return ll;  
    }
}