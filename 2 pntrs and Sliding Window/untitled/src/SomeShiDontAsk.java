import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SomeShiDontAsk {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {4, 0, -1, 3, 5, 3, 6, 8} , 3)));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] ans = new int[n - k +1];
        Deque<Integer> st = new ArrayDeque();
        int indx = 0;

        for(int i= 0 ; i<arr.length ; i++){

            if(!st.isEmpty() && st.peekFirst() <= i-k){
                st.pollFirst();
            }

            while(!st.isEmpty() && arr[st.peekLast()] <= arr[i]){
                st.pollLast();
            }

            st.offerLast(i);

            if(i >= k - 1){
                ans[indx++] = arr[st.peekFirst()];
            }
        }
        return ans;
    }
}
