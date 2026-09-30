import java.util.ArrayDeque;
import java.util.Deque;

public class SubArrayRanges {

    public long subArrayRanges(int[] nums) {

        //look at https://leetcode.com/problems/sum-of-subarray-minimums/description/ before coming here
        int n = nums.length;
        int[] nse = findNSE(nums,n);
        int[] psee = findPSEE(nums,n);
        int[] nge = findNGE(nums,n);
        int[] pgee = findPGEE(nums,n);

        long total=0;

        for(int i=0 ; i<n ; i++){
            //calculate min contribution;
            int minleft = i-psee[i];
            int minright = nse[i]-i;
            long minimumFreq = (long) minleft*minright;
            long minContribution= minimumFreq*nums[i];

            //calculate max contribution;
            int maxleft = i-pgee[i];
            int maxright = nge[i]-i;
            long maximumFreq = (long) maxleft*maxright;
            long maxContribution= maximumFreq*nums[i];

            total = total + (maxContribution - minContribution);
        }
        return total;

    }

    public int[] findNSE(int[] nums , int n){
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i=n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            ans[i]= !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }

        return ans;
    }

    public int[] findPSEE(int[] nums , int n){
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            ans[i]= !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

    public int[] findNGE(int[] nums , int n){
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i=n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            ans[i]= !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    public int[] findPGEE(int[] nums , int n){
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            ans[i]= !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

}
