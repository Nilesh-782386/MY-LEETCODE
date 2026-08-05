class Solution {
    public int islandPerimeter(int[][] arr) {

        int tot = 0;
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 1) {

                    if (i == 0 || arr[i - 1][j] == 0)
                        tot++;

                    if (i == n - 1 || arr[i + 1][j] == 0)
                        tot++;

                    if (j == 0 || arr[i][j - 1] == 0)
                        tot++;

                    if (j == m - 1 || arr[i][j + 1] == 0)
                        tot++;
                }
            }
        }

        return tot;
    }
}