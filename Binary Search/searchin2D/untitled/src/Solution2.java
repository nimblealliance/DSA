class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = (n * m) - 1;  // flattening of a 2D array into 1D indices

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m; // trying to find the 2D indices by 1D index
            int col = mid % m;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
