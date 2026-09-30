public class TransposeMatrix {
    public static void main(String[] args) {



    }

    public int[][] transpose(int[][] matrix){

        int rowLength= matrix.length;
        int colLength= matrix[0].length;
        int[][] ans = new int[colLength][rowLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
