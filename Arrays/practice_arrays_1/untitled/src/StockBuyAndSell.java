public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(sell(prices));
    }

    public static int sell(int[] prices){

        int buyingPrice=prices[0];
        int profit=0;
        int maxProfit=0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i]<buyingPrice){
                buyingPrice=prices[i];
            }

            profit=prices[i]-buyingPrice;
            maxProfit=Math.max(maxProfit,profit);

        }
        return maxProfit;
    }

}
