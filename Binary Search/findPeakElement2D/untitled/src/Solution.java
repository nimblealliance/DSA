import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int [][] mat = {{1,4},{3,2}};
        int [][] matAgain = {{70,50,40,30,20},{100,1,2,3,4}};

        System.out.println(Arrays.toString(findPeakGrid(matAgain)));

    }

    public static int findMaxIndex(int [][] mat , int n , int m , int row){
        int maxValue=-1;
        int index=-1;

        for (int i = 0; i < mat[0].length; i++) {
            if (mat[row][i]>maxValue){
                maxValue=mat[row][i];
                index=i;
            }
        }
        return index;

    }


    public static int[] findPeakGrid(int[][] mat) {

        int[] ans = new int[2];

        int n = mat.length;
        int m = mat[0].length;

        int low = 0 ; int high = n-1;

        while (low <= high){

            int mid = (low + high)/2;

            int maxColumnIndex=findMaxIndex(mat,n,m,mid);
            int top = mid - 1 >=0 ? mat[mid-1][maxColumnIndex] : -1;
            int bottom = mid+1 < n ? mat[mid+1][maxColumnIndex] : -1;

            if (mat[mid][maxColumnIndex] > top && mat[mid][maxColumnIndex] > bottom){
                ans[0]=mid;
                ans[1]=maxColumnIndex;
                return ans;
            } else if (mat[mid][maxColumnIndex] < top) {
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return new int[]{-1,-1};
    }
}
