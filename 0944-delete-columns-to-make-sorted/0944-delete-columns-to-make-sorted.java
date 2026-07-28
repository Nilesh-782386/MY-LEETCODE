class Solution {
    public int minDeletionSize(String[] s) {

        int len = s[0].length();
        int tot = 0;

        for (int i = 0; i < len; i++) {

            Character prev = null;

            for (int j = 0; j < s.length; j++) {

                char curr = s[j].charAt(i);

                if (prev != null && curr < prev) {
                    tot++;
                    break;
                }

                prev = curr;
            }
        }

        return tot;
    }
}