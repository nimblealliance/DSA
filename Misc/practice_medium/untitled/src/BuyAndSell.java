public class BuyAndSell {

    public static void main(String[] args) {

        int[] prices = {7,6,4,3,1};
        System.out.println(stock(prices));

    }


    public static int stock(int[] prices){

        int profit=0;
        int maxProfit=0;
        int buy=prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i]<buy){
                buy=prices[i];
            }

            profit = prices[i]-buy;
            maxProfit= Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
