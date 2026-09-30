import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] matrix2 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix3 = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};

        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println();
        setZeroes2(matrix3);
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }


    }

    public static void setZeroes3(int[][] matrix) {

        int rowLength= matrix.length;
        int colLength= matrix[0].length;
        int col0=1;

        for (int i = 0; i < rowLength; i++) {

            for (int j = 0; j < colLength; j++) {

                if (matrix[i][j]==0){

                    matrix[i][0]=0;
                    if (j!=0){
                        matrix[0][j]=0;
                    } else {
                        col0=0;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();

        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (matrix[0][0]==0){
            for (int j = 0; j < colLength; j++) {
                matrix[0][j]=0;
            }
        }

        if (col0==0){
            for (int i = 0; i < rowLength; i++) {
                matrix[i][0]=0;
            }
        }
    }



    public static void setZeroes2(int[][] matrix) {

        int rowLength= matrix.length;
        int columnLength= matrix[0].length;

        boolean[] rowArray= new boolean[rowLength];
        boolean[] columnArray = new boolean[columnLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (matrix[i][j]==0){
                    rowArray[i]=true;
                    columnArray[j]=true;
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (rowArray[i] || columnArray[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }

    public static void setZeroes(int[][] matrix) {

        int columnLength = matrix[0].length;
        int rowLength=matrix.length;

        List<int[]> posZeros = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ;j++) {
                if (matrix[i][j]==0){
                    int[] pos = {i,j};
                    posZeros.add(pos);
                }
            }
        }

        for (int[] pos : posZeros){
            System.out.println(Arrays.toString(pos));
        }

        for(int [] pos : posZeros){

            int row=pos[0];
            int column=pos[1];

            for (int i = 0; i < columnLength; i++) {
                matrix[row][i]=0;
            }

            for (int j = 0; j < rowLength; j++) {
                matrix[j][column]=0;
            }

        }
    }
}
