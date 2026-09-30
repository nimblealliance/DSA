import java.util.Arrays;

public class RotateMf {

    public static void main(String[] args) {


        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println(Arrays.deepToString(matrix2));
        rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));

        System.out.println();
        int[][] matrix3 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println(Arrays.deepToString(matrix3));
        rotate(matrix3);
        System.out.println(Arrays.deepToString(matrix3));


    }


    public static void rotate(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < n; j++) { //j starts from i+1 to avoid diagonal mfs
                System.out.println("swapping for "+i +","+j+" and "+j+","+i);
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            int j=0;
            int k = matrix[0].length-1;

            while(j<=k){
                int temp = matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                j++;
                k--;
            }
        }
    }


}
