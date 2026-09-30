import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Misc {

    public static void main(String[] args) {

        int[] arr = {5,4,4,1,1};
        int[] arr2 = {7,4,1,5,3};

        mergesort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


        quicksort(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));

    }

    public static void quicksort(int[] arr , int low , int high){

        if (low < high){
            int partition = partitionIndex(arr , low , high);
            quicksort(arr, low , partition-1);
            quicksort(arr , partition+1, high);

        }

    }

    public static int partitionIndex(int [] arr , int low , int high){

        int pivot = arr[low];
        int i = low;
        int j = high;


        while(i<j){

            while(arr[i]<=pivot && i <=high-1){
                i++;
            }

            while (arr[j]> pivot && j >= low+1){
                j--;
            }

            if (i<j){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }

        int temp2=arr[j];
        arr[j]=arr[low];
        arr[low]=temp2;
        return j;


    }

































    public static void mergesort(int[] arr , int low , int high){

        if (low >= high){
            return;
        }
        int mid = (low +high)/2;
        mergesort(arr , low , mid);
        mergesort(arr,mid+1,high);
        merge(arr,low , mid, high);

    }

    public static void merge(int[] arr , int low , int mid , int high){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while (left <=mid && right<=high){
            if (arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }

    }

}
