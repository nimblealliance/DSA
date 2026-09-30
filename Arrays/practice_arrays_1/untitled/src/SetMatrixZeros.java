import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros2(nums);
        System.out.println(Arrays.deepToString(nums));
    }



    public static void setZeros2(int[][] matrix){

        int rowLength= matrix.length;
        int colLength=matrix[0].length;
        boolean col0=false;


        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0; //mark the first column

                    if(j==0){
                        col0=true;
                    }else{
                        matrix[0][j]=0; // mark the first row
                    }

                }
            }
        }

        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {

                if (matrix[0][j] == 0 || matrix[i][0] ==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (matrix[0][0]==0){
            for (int j = 0; j < colLength; j++) {
                matrix[0][j]=0;
            }
        }

        if(col0){
            for (int i = 0; i < rowLength; i++) {
                matrix[i][0]=0;
            }

        }

    }



    public static void setZeros(int[][] nums){

        int rowLength= nums.length;
        int colLength=nums[0].length;

        boolean[] row= new boolean[rowLength];
        boolean[] col= new boolean[colLength];


        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {

                if (nums[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {

                if (row[i] || col[j]){
                    nums[i][j]=0;

                }
            }
        }









    }
}
