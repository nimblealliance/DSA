import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatureMf {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));


    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nge = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                st.pop();
            }

            nge[i] = !st.isEmpty() ? st.peek() : i;
            st.push(i);
        }

        int[] ans = new int[n];

        for (int i=0 ; i<n ; i++){
            ans[i] = nge[i] - i;
        }
        return ans;
    }
}
