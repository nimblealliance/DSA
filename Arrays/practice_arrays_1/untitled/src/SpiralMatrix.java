import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

    }


    public static List<Integer> spiralMatrix(int[][] matrix){

        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> temp = new ArrayList<>();

        while(left<=right && top <= bottom){

            for (int i = left; i <=right; i++) {
                temp.add(matrix[top][i]);
            }top++;

            for (int i = top; i <=bottom ; i++) {
                temp.add(matrix[i][right]);
            }right--;

            if (top<=bottom){
                for (int i = right; i >=left ; i--) {
                    temp.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left<=right){
                for (int i = bottom; i >=top ; i--) {
                    temp.add(matrix[i][left]);
                }left++;
            }
        }

        return temp;


    }

}
