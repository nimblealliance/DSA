import java.util.Arrays;

public class QuickSortCode {

    public static void main(String[] args) {

        int[] arr = {7,4,1,5,3};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr , int low , int high){

        if (low < high){
            int partitionIndex = partitionIndex(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);

        }
    }


    public static int partitionIndex(int[] arr , int low , int high){

        int pivot=arr[low];
        int i = low;
        int j=high;


        while(i<j){

            while (arr[i]<=pivot && i<=high-1){
                i++;
            }

            while (arr[j]> pivot && j >=low +1){
                j--;
            }

            if ( i < j ) {
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
}
