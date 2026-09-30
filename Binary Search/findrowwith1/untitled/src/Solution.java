public class Solution {

    public static void main(String[] args) {
        int [] [] mat = {{0,0,1},{0,1,1},{0,1,1}};
        System.out.println(rowWithMax1s(mat));
    }


    public static int rowWithMax1s(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;
        int ans =-1;
        int maxCount=0;

        for (int i = 0; i < row; i++) {

            int count=0;

            for (int j = 0; j < col; j++) {
                if (mat[i][j]==1){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount=count;
                ans=i;
            }
        }
        return ans;
    }
}
