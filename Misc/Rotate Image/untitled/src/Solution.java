import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        ;
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();

        rotateImage(matrix);


    }


    public static void rotateImage(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;

            }
        }


        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        for (int i = 0; i < m; i++) {
            int j = 0;
            int k = matrix[0].length - 1;
            while (j < k) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                j++;
                k--;
            }
        }

        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public static int[][] transpose(int [] [] matrix){

        int m = matrix.length;
        int n= matrix[0].length;

        int[] [] ans = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i]=matrix[i][j];

            }
        }

        return ans;

    }


}