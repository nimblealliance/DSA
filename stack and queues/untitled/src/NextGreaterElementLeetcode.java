import java.util.*;

public class NextGreaterElementLeetcode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = nums2.length -1;i>=0 ; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(nums2[i]);
                map.put(nums2[i], -1);
            }else {
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);
            }
        }

        int[] ans = new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
