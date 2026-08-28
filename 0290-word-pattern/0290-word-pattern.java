class Solution {
    public boolean wordPattern(String ss, String s) {

        HashMap<Character, String>h = new HashMap<>();

        String arr[] = s.split(" ");

        HashSet<String>m = new HashSet<>();
        for(String f    :arr){
            m.add(f);
        }
        if(ss.length() != arr.length) return false;


        for( int i = 0;i<ss.length();i++){
            char ch = ss.charAt(i);
            if(h.containsKey(ch)){
                if( !(arr[i].equals(h.get(ch))) )return false;
                //  h.put(ch  , arr[i]);
            }else{
                h.put(ch  , arr[i]);
            }
        } 

        if(h.size() != m.size()) return false;

        return true;
         
    }
}