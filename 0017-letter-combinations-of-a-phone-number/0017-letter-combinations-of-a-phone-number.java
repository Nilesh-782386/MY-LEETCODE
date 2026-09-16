class Solution {

    void help(HashMap<Integer,String>hm ,String s ,  ArrayList<String>a , int idx , StringBuilder sb){

    if(idx == s.length() ){
        a.add(sb.toString());
     return;    
    }
     int currId = s.charAt(idx)-'0';
     String  ss = hm.get(currId);

     for( int i = 0 ; i<ss.length();i++){
       sb.append(ss.charAt(i));
       help(hm , s,a , idx+1 , sb);
       sb.deleteCharAt(sb.length()-1);
     }
    }
    public List<String> letterCombinations(String digits) {

    HashMap<Integer,String>hm = new HashMap<>();

     hm.put(2 , "abc");
     hm.put(3 , "def");
     hm.put(4 , "ghi");
     hm.put(5 , "jkl");
     hm.put(6 , "mno");
     hm.put(7 , "pqrs");
     hm.put(8 , "tuv");
     hm.put(9, "wxyz");

     ArrayList<String>a = new ArrayList<>();
     help(hm , digits , a , 0  , new  StringBuilder());

     return a;
    }
}