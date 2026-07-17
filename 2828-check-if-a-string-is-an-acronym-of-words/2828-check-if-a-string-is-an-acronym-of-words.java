class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        StringBuilder  sb =  new StringBuilder("");

        for( int i = 0;i<words.size();i++){

            String word = words.get(i);
            sb.append(word.charAt(0));
        }

        String cmp = sb.toString();


        return s.equals(cmp);


        
    }
}