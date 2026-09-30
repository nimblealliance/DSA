public class Solution2 {

    public static void main(String[] args) {

        int[] A = {1,3,4,7,10};
        int[] B = {2,3,6,15};

        System.out.println(findMedianSortedArrays(A, B));
    }

    public static double findMedianSortedArrays(int[] A, int[] B) {

        int n1 = A.length;
        int n2 = B.length;

        if (n1 > n2){
            return findMedianSortedArrays(B , A);
        }

        int low = 0;
        int high = n1;
        int left = (n1 + n2 + 1)/2;
        int total = n1+n2;

        while (low <= high){

            int mid1 = (low + high)/2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid1 < n1) r1 = A[mid1];
            if (mid2 < n2) r2 = B[mid2];
            if (mid1 - 1 >=0) l1 = A[mid1 - 1];
            if (mid2 - 1 >=0) l2 = B[mid2 - 1];

            if (l1 <= r2 && l2 <= r1){

                if (total % 2 == 1){
                    return Math.max(l1,l2);
                }
                return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
            } else if (l1 > r2) {
                high = mid1 - 1;
            }else low = mid1 + 1;
        }
        return 0.0;
    }

}
