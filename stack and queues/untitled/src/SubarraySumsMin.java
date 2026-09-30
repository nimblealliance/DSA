import java.util.ArrayDeque;
import java.util.Deque;

public class SubarraySumsMin {

    public static void main(String[] args) {
//        System.out.println(sumSubarrayMins(new int[]{4,-2,-3,4,1}));
        System.out.println(sumSubarrayMins(new int[]{3,5,1,7,5,9}));
    }

    public static int sumSubarrayMins(int[] arr) {

        int n  = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int sum = 0;
        int mod = (int)1e9 + 7;

        for(int i=0 ; i<n ; i++){

            int left = i - psee[i]; // how many positions in left does the previous smaller element exists?
            int right = nse[i] - i; // how many positions to the right does the next smaller element exist?
            long subarrayCountFreq = left * right *1L; // total count of subarrays in which the current element is the smallest will be left * right

            int val = (int) ((subarrayCountFreq * arr[i]) % mod) ; //multiply it by arr[i] to get its actual contribution across all subarrays;
            sum = (sum + val) % mod; // add it to the sum
        }
        return sum;

    }

    public static int[] findNSE(int[] arr){ // find the next smaller element
        int n  = arr.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = n-1 ; i>= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // comparing the values , since stack has index hence the arr[st.peek()]
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i); //pushing index of the smaller element to the stack
        }
        return ans; //ans will have NSE index for every arr[i]
    }

    public static int[] findPSEE(int[] arr){ // find the previous smaller element and equal
        int n  = arr.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){ // the > in this section is used to handle edge case of duplicate nums eg . [1,1] , it will be useful to avoid repeat counting
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i); // stack has index of the elements
        }
        return ans;
    }

}
