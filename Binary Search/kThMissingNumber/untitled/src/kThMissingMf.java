public class kThMissingMf {

    public static void main(String[] args) {

        int [] nums = {2,3,4,7,11};
        int k=5;

        System.out.println(findKthPositive(nums,k));

    }


    public static int findKthPositive(int[] arr, int k) {

        boolean[] exists = new boolean[30000];

        for (int x : arr) {
            exists[x] = true;

        }


        int low = 1;
        int high=29000;

        while(low<=high){

            int mid = low + ((high-low)/2);

            int missingNumCount=missingCount(arr , exists , mid );

            if (missingNumCount<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }


        }
        return low;

    }


    public static int missingCount( int[] arr , boolean[] exists , int upperBound){

        int missingCounter=0;
        for (int i = 1; i < upperBound; i++) {

            if (!exists[i]){
                missingCounter++;
            }
        }

        return missingCounter;

    }



}
