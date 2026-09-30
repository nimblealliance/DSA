public class SquareRootOfNum {

    public static void main(String[] args) {

        System.out.println(squareRoot(50));
    }

    public static int squareRoot(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {

            int mid = low + ((high - low) / 2);
            long squared = (long) mid * mid;

            if (squared == n) {
                return mid;
            } else if (squared > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}
