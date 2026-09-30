public class findPeak {

    public static void main(String[] args) {

        int [] nums = {1,2,3,5,2,0};
        System.out.println(findPeak(nums));

    }


    public static int findPeak(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high=mid;
            } else {
                low = mid+1;
            }
        }

        return low;
    }



}
