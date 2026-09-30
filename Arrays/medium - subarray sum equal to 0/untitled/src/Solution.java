import java.util.HashMap;

public class Solution {


    public static void main(String[] args) {
        int[] arr ={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr));
    }


    public static int maxLen(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;
        int ans=0;
        int length=0;

        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
            System.out.println("sum is : "+sum);
            if(sum==0){
                ans=i+1; //to compensate for zero based indexing in arrays
            }

            if (map.containsKey(sum)){ // if sum exists in the hashmap , that means sum -k -> sum - 0 , there exists a subarray with k = 0 , and sum in the hashmap
                // sum = something+k ; sum-k = something , here k itself is zero , so sum = something , search for sum in the hashmap , that will give you the starting index
                // of the place where subarray with sum =0 starts , same as sum-k in LC 560 , just that here k is 0
                length=i-map.get(sum);
                ans=Math.max(length,ans);
                System.out.println("ans is "+ans);

            }
            if (!map.containsKey(sum)){ //only put the element if it doesn't already exist in the hashmap , we don't wanna override the earlier values
                System.out.println("thang being put "+sum+", value: "+i);
                map.put(sum,i);
            }
            System.out.println();

        }
        return ans;

    }


}

