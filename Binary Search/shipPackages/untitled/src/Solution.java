class Solution {

    public static void main(String[] args) {
        int [] weights= {1,2,3,1,1};
        int days=4;
        System.out.println(shipWithinDays(weights,days));
    }


    public static int shipWithinDays(int[] weights, int days) {


        int maxWeight = 0, totalWeight = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }

        int low = maxWeight, high = totalWeight;

        while(low<=high){
            int mid = low +((high-low)/2);

            if (calculateShippingDays(weights,mid)<=days){
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }

        return low;

    }


    public static int calculateShippingDays(int[] weights , int maxWeight){

        int shippingDays=1;
        int totalWeight=0;

        for(Integer x : weights){

            if (totalWeight+x > maxWeight){
                shippingDays++;
                totalWeight=0;
            }
            totalWeight+=x;
        }
        return shippingDays;

    }



}