class Solution {
    public List<String> stringMatching(String[] words) {
List<String>a  = new ArrayList<>();
      for( int i = 0;i<words.length;i++)  {
        for(int j = 0;j<words.length;j++){

            String s1 = words[i];
            String s2 = words[j];

            if(   !(s1.equals(s2)) && s1.contains(s2)  ){
                
                if(!a.contains(s2)){
                    a.add(s2);
                }
            }
        }
      }

      return a;
    }
}