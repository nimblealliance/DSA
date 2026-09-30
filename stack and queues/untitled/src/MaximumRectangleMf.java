import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumRectangleMf {

    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {
        int maxArea = 0;

        int row = matrix.length;
        int col = matrix[0].length;
        int[] heights = new int[col];

        for(int i=0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                int digit = matrix[i][j] - '0';
                if(digit == 1){
                    heights[j]=heights[j] +1;
                }else {
                    heights[j]=0;
                }
            }
            int area = findMaxAreaOfHistogram(heights);
            maxArea = Math.max(maxArea , area);
        }
        return maxArea;
    }

    public static int findMaxAreaOfHistogram(int[] heights){
        Deque<Integer> st = new ArrayDeque<>();
        int maxArea =0;
        int n = heights.length;

        int nse , pse = 0;

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int ind = st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                int area = heights[ind] * (nse - pse - 1);
                maxArea = Math.max(maxArea , area);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int ind = st.pop();
            nse = n;
            pse = st.isEmpty() ? -1 : st.peek();
            int area = heights[ind] * (nse - pse - 1);
            maxArea = Math.max(maxArea , area);
        }

        return maxArea;
    }

}
