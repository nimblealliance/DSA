class Solution {
    public int[][] transpose(int[][] matrix) {

        // not guaranteed to be a box matrix i.e. m == n , so we use another matrix to hold the ans
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int [n][m];

        for (int i = 0 ; i < m; i++){
            for (int j =0 ; j < n ; j++){
                res[j][i] = matrix[i][j];
            }

        }

        return res;
    }
}