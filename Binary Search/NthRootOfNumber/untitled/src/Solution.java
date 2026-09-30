class Solution {

    public static void main(String[] args) {
        System.out.println(NthRoot(4,81));
    }


    public static int NthRoot(int N, int M) {

        int low=1;

        int high=M;

        while(low<=high){
            int mid=low +((high-low)/2);
            int val=calculatePow(N,mid,M);

            if (val == 1){ // exact match
                return mid;
            } else if (val == 0) {
                low=mid+1; // increase the number , since the calculatePow returned 0 which means the mid's value raised to power N is smaller than M
            }else{ // reduce the number , since the calculatePow returned 2 which means the mid's value raised to power N is exceeding M
                high=mid-1;
            }
        }
        return -1;
    }


    public static int calculatePow(int N, int mid , int M){
        long ans=1; // to avoid silent overflows before we check (ans>M)

        for (int i = 1; i <= N; i++) {
            ans=mid*ans;
            if (ans > M) return 2;
        }
        if (ans == M) return 1;
        return 0;
    }

}
