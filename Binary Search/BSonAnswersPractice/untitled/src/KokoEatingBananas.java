public class KokoEatingBananas {

    public static void main(String[] args) {

        int [] piles = {30,11,23,4,20};
        int h = 6;

        System.out.println(minEatingSpeed(piles,h));

    }


    public static int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=maxValOfPiles(piles);

        while(low<=high){

            int mid = low + ((high-low)/2);

            long result = calculateHours(piles, mid);

            if (result<=h){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        return low;
    }


    public static long calculateHours(int[] piles , int currSpeed){

        long hours=0;

        for (int i = 0; i < piles.length; i++) {
            hours+= (piles[i]+ currSpeed -1)/ currSpeed;

        }

        return hours;

    }



    public static int maxValOfPiles(int[] piles){

        int maxVal=Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            maxVal=Math.max(maxVal,piles[i]);
        }
        return maxVal;
    }

}
