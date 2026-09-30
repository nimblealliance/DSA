import java.util.*;

public class MaxSidingWindowMf {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0 ; i<n ; i++){

            while(!q.isEmpty() && q.peek() <= (i-k)){
                q.poll();
            }

            while(!q.isEmpty() && nums[q.peek()] < nums[i]) {
                q.poll();
            }
            q.offer(i);

            if(i >= (k -1)){
                temp.add(nums[q.peek()]);
            }
        }

        int [] ans = new int[temp.size()];
        for(int i = 0 ; i< ans.length ; i++){
            ans[i]= temp.get(i);
        }
        return ans;

    }
}
