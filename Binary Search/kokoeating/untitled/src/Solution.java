public class Solution {

    public static void main(String[] args) {
//        int[] piles = {3,6,7,11};

        int[] piles = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h= 823855818;

        System.out.println(minEatingSpeedBS(piles, h));


    }



    public static int minEatingSpeedBS(int[] piles, int h) {

        int max_val = findMax(piles);

        int low = 1;
        int high = max_val;

        while(low <= high){

            int mid = low +((high-low)/2);

            if (calculateHours(piles,mid) <= h){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }


    public static int minEatingSpeedBF(int[] piles, int h) {

        int max_val=findMax(piles);

        int min_speed=1;

        for (int i = 1; i <= max_val; i++) {

            if (calculateHours(piles,i)<=h){
                return i;
            }
        }

        return max_val;

    }

    public static long calculateHours(int[] piles , int currSpeed){

        long totalHours=0;

        for (int i = 0; i < piles.length; i++) {
            totalHours += (int) Math.ceil((double) piles[i] /currSpeed);
        }

        return totalHours;
    }


    public static int findMax(int[] piles){

        int max_val=Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i]>max_val){
                max_val=piles[i];
            }
        }
        return max_val;
    }
}



