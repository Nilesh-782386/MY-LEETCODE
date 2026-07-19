class Solution {
    
    int exist(String ruleKey){
        if(ruleKey.equals("type") ) return 1;
        if(ruleKey.equals("color")) return 2;
        if(ruleKey.equals("name")) return 3;
        return 0;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        

      int idx = exist(ruleKey);
      int k= 0;

      for( int i = 0;i<items.size();i++){
        if(items.get(i).get(idx-1).equals(ruleValue) ) {
            k++;
            
        }
      }
      return k;
    
    }
}