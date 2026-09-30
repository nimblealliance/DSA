import java.util.*;

public class Solution {


    public static void main(String[] args) {

        int[] nums = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int target=8;
        System.out.println(fourSum2(nums,target));

    }



    public static List<List<Integer>> fourSum3(int[] nums , int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for (int i = 0; i < n; i++) {

            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int j = i+1; j < n; j++) {
                if (j>i+1 && nums[j]==nums[j-1]) continue;

                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    if (sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                        while (k<l && nums[k]==nums[k-1]) k++;
                        while (k<l && nums[l]==nums[l+1]) l--;
                        k++;
                        l--;

                    } else if (sum < target) {
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }






    public static List<List<Integer>> fourSum2(int[] nums , int target){

        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                HashSet<Long> set = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    long remaining = (long)target - sum;
                    if (set.contains(remaining)){
                        List<Integer> quads = Arrays.asList(nums[i],nums[j],nums[k],(int) remaining);
                        Collections.sort(quads);
                        ans.add(quads);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        return ans.stream().toList();
    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {

                        long sum = nums[i]+nums[j];
                        sum+=nums[k];
                        sum+=+nums[l];

                        if (sum==target){
                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                         Collections.sort(temp);
                         if (!ans.contains(temp)){
                             ans.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
