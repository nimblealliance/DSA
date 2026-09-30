import java.util.ArrayDeque;
import java.util.Deque;

public class LargestHistogramMf {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }


    public static int largestRectangleArea(int[] heights) {

        int maxArea = 0;
        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int pse , nse;
        int area ;

        for(int i=0 ; i<n ; i++){

            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int ind = st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                area = heights[ind]*(nse - pse - 1);
                maxArea = Math.max(maxArea,area);
            }

            st.push(i);
        }

        while(!st.isEmpty()){
            int ind = st.pop();
            nse = n;
            pse = st.isEmpty() ? -1 : st.peek();
            area = heights[ind]*(nse - pse - 1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }




}
