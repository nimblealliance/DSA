import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SomeShiiDontEverAskLol {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr , k)));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        int index = 0;
        for(int i=0 ; i<arr.length ; i++){

            if(!queue.isEmpty() && queue.peekFirst() <= i-k){
                queue.pollFirst();
            }

            while(!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]){
                queue.pollLast();
            }

            queue.offer(i);

            if(i >= k -1){
                ans[index++] = arr[queue.peekFirst()];
            }
        }
        return ans;
    }
}
