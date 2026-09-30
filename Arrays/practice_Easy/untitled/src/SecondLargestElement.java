public class SecondLargestElement {

    public static void main(String[] args) {

        int[] nums ={1,2,4,7,7,5};

        System.out.println(secondLargest(nums));
        System.out.println(secondSmallest(nums));

    }

    public static int secondLargest(int[] arr){

        int largest=arr[0];
        int secondLargest=-1;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i]>secondLargest && arr[i]<largest) {
                secondLargest=arr[i];
            }

        }

        return secondLargest;


    }

    public static int secondSmallest(int[] arr){

        int small=Integer.MAX_VALUE;

        int second_small =Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<small){
                second_small =small;
                small=arr[i];
            } else if (arr[i] < second_small  && arr[i]!=small) {
                second_small =arr[i];
            }
        }

        return second_small ;


    }


}
