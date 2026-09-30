class Solution2 {
    public static void main(String[] args) {

        int N = 9;
        int M = 512;
        System.out.println(NthRoot(9,512));

    }


    public static int NthRoot(int N, int M) {

        int low = 1;
        int high = M;

        while (low <= high) {

            int mid = low + ((high - low) / 2);
            int pow = calculatePow(N, M, mid);

            if (pow == 1) {
                return mid;
            } else if (pow == 2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int calculatePow(int N, int M, int currNum) {

        long ans = 1;

        for (int i = 0; i < N; i++) {
            ans = currNum * ans;

            if (ans > M) {
                return 2;
            }
        }

        if (ans == M) {
            return 1;
        }
        return 0;
    }
}
