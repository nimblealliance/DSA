class Solution {
    public void rotate(int[][] matrix) {

        //since its a box matrix , we can do it in-place unlike LC - 867
        int n = matrix.length;
        for (int i = 0 ; i < n ; i++){
            for (int j=i+1 ; j < n ; j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        for (int i =0 ; i < n ; i++){
            int j=0;
            int k=matrix.length-1;
            while (j<k){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                j++;
                k--;
            }
        }
    }
}