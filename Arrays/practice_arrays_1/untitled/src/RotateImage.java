import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }


    public static void rotate(int[][] matrix){

        int rowLength=matrix.length;
        int colLength=matrix[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = i+1; j < colLength; j++) {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < rowLength; i++) {
            reverse(matrix[i],0, matrix.length-1);
        }

    }

    public static void reverse(int[] nums , int start , int end){

        while (start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }

}
