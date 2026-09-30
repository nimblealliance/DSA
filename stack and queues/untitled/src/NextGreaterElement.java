import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(nextLargerElement(new int[]{6, 8, 0, 1, 3})));
    }

    public static int[] nextLargerElement(int[] arr) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        int[] ans = new int[arr.length];

        for(int i=n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
                st.push(arr[i]);
            }
        }
        return ans;
    }
}

