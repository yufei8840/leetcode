class Solution {
    public int[][] generateMatrix(int n) {
        int start = 0, count = 1, loop = 0;
        int[][] res = new int[n][n];
        int i, j;

        while (loop++ < n / 2) {
            for (i = start; i < n - loop; i++) {
                res[start][i] = count++;
            }
            for (j = start; j < n - loop; j++) {
                res[j][i] = count++;
            }
            for (; i >= loop ; i--) {
                res[j][i] = count++;
            }
            for (; j >= loop; j--) {
                res[j][i] = count++;
            }
            start++;
        }

        if (n%2 == 1) {
            res[start][start] = count++;
        }

        return res;
    }
}
