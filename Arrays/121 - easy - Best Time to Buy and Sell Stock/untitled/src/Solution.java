class Solution {

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maxProfit = 0;


        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyingPrice) {
                buyingPrice = prices[i];
            } else {
                int profit = prices[i] - buyingPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

}