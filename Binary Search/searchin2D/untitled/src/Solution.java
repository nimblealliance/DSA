public class Solution {

    public static void main(String[] args) {

        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1000;
        System.out.println(searchMatrix(matrix,target));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;
        int low=0;
        int high=col-1;

        for (int i = 0; i < row; i++) {

            if (matrix[i][low]<=target && target<=matrix[i][high]){
                while (low <= high){
                    int mid = (low + high)/2;

                    if (matrix[i][mid]==target){
                        return true;
                    }else if (matrix[i][mid]>target){
                        high = mid - 1;
                    }else {
                        low = mid + 1;
                    }
                }
            }
        }
        return false;
    }

}
