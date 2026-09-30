import java.util.Arrays;

class Solution2 {

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = 1;

        //iterate through the matrix and find zeros ,  if you find a zero mark the 0th row and 0th col as zero

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if (j != 0) {
                        matrix[0][j] = 0;

                        // if the current element is in the top right corner where i and j both are 0 i.e , {0,0} pos it overlaps
                        // so we take a new variable and mark it as zero to not overlap with i's 0th position
                    } else {
                        col0 = 0;
                    }

                }
            }
        }
        //first we take care of everything else than first row and first column
        // here we start from {1,1} and update it to zero
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }

            }
        }

        // then we take care of first row by checking the mark at matrix of [0][0] , if it is marked as 0 we set the entire
        //first row as zero
        if (matrix[0][0] == 0) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        // then we check the col0 variable and see if it has been marked as 0 , if yes then we set the first column to zero
        if (col0 == 0) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    // Better sol
    // public void setZeroes(int[][] matrix) {
    //     int row = matrix.length; //number of rows in the outer array
    //     int col = matrix[0].length; // number of columns in the first inner array

    //     boolean[] rowZeros = new boolean[row];
    //     boolean[] colZeros = new boolean[col];

    //     for (int i = 0 ; i < row ; i++){
    //         for (int j =0 ; j < col ; j++){
    //             if (matrix[i][j]==0){
    //                 rowZeros[i]=true;
    //                 colZeros[j]=true;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.toString(rowZeros));
    //     System.out.println(Arrays.toString(colZeros));
    //     for (int i = 0 ; i < row ; i++){
    //         for (int j =0 ; j < col ; j++){
    //             if (rowZeros[i] || colZeros[j]){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }

    // }

    // public void setZeroes(int[][] matrix) {

    //     List<int[]> posOfZeros = new ArrayList<>();
    //     System.out.println(matrix[0].length);
    //     System.out.println(matrix.length);
    //     for (int i =0 ; i < matrix.length ; i++){
    //         for (int j =0 ; j<matrix[i].length ; j++){
    //             if (matrix[i][j]==0){
    //                 posOfZeros.add(new int[]{i,j});
    //             }
    //         }
    //     }

    //     for (int[] pos : posOfZeros){
    //          System.out.println(Arrays.toString(pos));
    //     }

    //     for (int[] pos : posOfZeros){
    //         int row = pos[0];
    //         int col = pos[1];

    //         //kept the row same and looped through the column values to mark the entire row with zeros
    //         for (int i =0 ; i<matrix[0].length;i++){
    //             matrix[row][i]=0;
    //         }

    //         //kept the column same and looped through the row values to mark the entire column with zeros 
    //         //0,0 , 1,0 , 2,0
    //         for (int j =0 ; j <matrix.length; j++){
    //             matrix[j][col]=0;
    //         }

    //     }  
    // }

}