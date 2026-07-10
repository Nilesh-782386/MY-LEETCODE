class Solution {
    public String mergeAlternately(String s1, String s2) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < s1.length() || i < s2.length()) {

            if (i < s1.length()) {
                sb.append(s1.charAt(i));
            }

            if (i < s2.length()) {
                sb.append(s2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }
}