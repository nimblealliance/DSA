import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanStriver {

    public static void main(String[] args) {


    }
    public int[] stockSpan(int[] arr, int n) {
        Deque<int[]> st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i = 0; i<n ; i++){
            int span = 1;
            while(!st.isEmpty() && st.peek()[0] <= arr[i]){
                span+=st.pop()[1];
            }
            st.push(new int[]{arr[i], span});
            ans[i] = span;
        }
        return ans;
    }
}
