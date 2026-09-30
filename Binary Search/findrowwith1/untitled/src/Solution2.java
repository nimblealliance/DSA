public class Solution2 {

    public static void main(String[] args) {
        int [] [] mat = {{0,0,1},{0,1,1},{0,1,1}};
        System.out.println(rowWithMax1s(mat));
    }


    public static int rowWithMax1s(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;
        int countOfOnes =0;
        int maxCountOfOnes=0;
        int ans=-1;

        for (int i = 0; i < row; i++) {

            int low = 0;
            int high = col-1;

            while (low <= high){
                int mid = (low+high)/2;

                if (mat[i][mid]==1){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }

            countOfOnes = col-low;

            if (countOfOnes > maxCountOfOnes){
                maxCountOfOnes=countOfOnes;
                ans=i;
            }
        }
        return ans;
    }


}
