public class CapacityToShip {

    public static void main(String[] args) {


    }




    public static int shippingDays(int [] weights , int days){

        int low=Integer.MIN_VALUE;
        int high=0;

        for (Integer w : weights){
            low=Math.max(low,w);
            high+=w;
        }

        while(low<=high){

            int mid = low + ((high - low)/2);

            boolean possibility = isPossibleToShip(weights,days,mid);

            if (possibility){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return low;
    }


    public static boolean isPossibleToShip(int [] weights , int days , int currentWeight){

        int sumToShip=0;
        int daysToShip=1;
        for (int i = 0; i < weights.length; i++) {

            if (sumToShip+weights[i]>currentWeight){
                daysToShip++;
                sumToShip=0;
            }
            sumToShip+=weights[i];

        }
        return daysToShip<=days;
    }

}
