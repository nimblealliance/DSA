class Solution {

    public static void main(String[] args) {
        int [] arr = {3, 6, 12, 19, 33, 44, 67, 72, 89, 95};
        int k = 2;
        System.out.println(minimiseMaxDistance(arr,k));
    }


    public static double minimiseMaxDistance(int[] arr, int k) {

        double low = 0;
        double high=0;

        for (int i =0; i < arr.length - 1 ; i++){
            high=Math.max(high , arr[i+1]-arr[i]);

        }

        double diff = 1e-6;
        int runtimes=0;
        while (high - low > diff){
            runtimes++;
            double mid = (low + high)/2;

            int cnt = countOfGasStationsPlaced(arr , mid);

            if (cnt > k){
                low=mid;
            }else {
                high=mid;
            }
        }
        System.out.println("ran for : " + runtimes);
        return high; //polarity concept from before doesn't work , but high is at a place where it is possible to put k gas stations with minimum max distance hence returning high;
    }

    public static int countOfGasStationsPlaced(int[] arr , double dist){
        int cnt=0;

        for(int i=1 ; i < arr.length ; i++){

            int numOfGasStationsBetween= (int) ((arr[i] - arr[i-1])/dist);

            if ((arr[i] - arr[i -1 ]) == (numOfGasStationsBetween*dist)){
                numOfGasStationsBetween--;
            }
            cnt +=numOfGasStationsBetween;
        }
        return cnt;
    }

}


