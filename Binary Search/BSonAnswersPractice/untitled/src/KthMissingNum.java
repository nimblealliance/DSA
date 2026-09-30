public class KthMissingNum {

    public static void main(String[] args) {
        int [] nums = {2,3,4,7,11};
        int k=5;

        System.out.println(kThMissing(nums,k));


    }




    public static int kThMissing(int[] arr , int k){

        int max=1001;
        boolean[] exists = new boolean[max];

        for (Integer x : arr){
            exists[x] = true;
        }


        int countMissing=0;
        for (int i=1 ; i < exists.length ; i++){
            if (!exists[i]){
                countMissing++;
            }

            if (countMissing==k){
                return i;
            }
        }
        return -1;
    }
}
