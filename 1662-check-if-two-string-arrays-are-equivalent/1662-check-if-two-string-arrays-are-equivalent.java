class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");

        for(int i = 0;i<word1.length;i++){

            String s = word1[i];
            s1.append(s);
        }

        for(int i = 0;i<word2.length;i++){

            String s = word2[i];
            s2.append(s);
        }


      String ss1 = s1.toString();
     String ss2= s2.toString();
    return   ss1.equals(ss2);
    }
}