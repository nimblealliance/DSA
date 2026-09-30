public class Solution {

    public static void main(String[] args) {
        int [] bloomDay = {7,7,7,7,12,7,7};
        int m=2;
        int k=3;

        System.out.println(minDays(bloomDay,m,k));
    }


    public static int minDays(int[] bloomDay , int m , int k){

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        int low=minDay;
        int high =maxDay;

        int ans=-1;

        while(low<=high){

            int mid = low + ((high-low)/2);

            if (isTotalBouquetsPossible(bloomDay , m , k , mid)){
                ans=mid;
                high=mid-1;

            }else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean isTotalBouquetsPossible(int[] bloomDay , int m , int k , int day){

        int totalBouquets=0;
        int count=0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i]<=day){
                count++;
                if (count==k){
                    totalBouquets++;
                    count=0;
                }
            }else {
                count=0;
            }
        }
        return totalBouquets>=m;
    }

}
