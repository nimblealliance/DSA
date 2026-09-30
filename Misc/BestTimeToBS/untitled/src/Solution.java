public class Solution {

    public static void main(String[] args) {

        int[] nums={7,1,5,3,6,4};
        int[] nums2={7,6,4,3,1};
        int[] nums3 = {1,2,1,0,1};
        int[] nums4= {2,4,1};
        System.out.println(bestTime(nums));
        System.out.println();
        System.out.println(bestTime(nums2));
        System.out.println();
        System.out.println(bestTime(nums3));
        System.out.println();
        System.out.println(bestTime(nums4));

    }

    public static int bestTime(int[] prices){

        int maxProfit=0;
        int minCost=prices[0];

        for (int i = 1; i < prices.length; i++) {

            int profit=prices[i]-minCost;
            maxProfit = Math.max(maxProfit,profit);
            minCost= Math.min(minCost,prices[i]);

        }
        return maxProfit;
    }
}
