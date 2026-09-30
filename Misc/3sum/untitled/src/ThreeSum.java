import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-2,-2,-2,-1,-1,-1,0,0,0,0,2,2,2,2};
        int[] nums2 = {0,1,1};

        System.out.println(threeSum3(nums));
//        System.out.println(threeSum(nums2));
    }


    public static List<List<Integer>> threeSum3(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); //sorting is important here since we are using 2 pointers to calculate the sum and move them according to the sum's value , if the array isn't sorted below logic won't work
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i]==nums[i-1]){  //skipping duplicates for i which is the first number e.g. in an array like -2,-2,-2,-1,-1,-1..... , we don't need the for loop to run for i=-2 the second time bcz it might
                // generate a duplicate , so we skip the loop till nums[i] != nums[i-1] i.e. a new element
                continue;
            }

            int j=i+1;
            int k= nums.length-1;

            while (j <k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++; // imagine J here -2,-2,-2,-1 , j will reach till the last -2 bcz that's where nums[j]!=nums[j+1] according to the above while loop, but we actually need to go to the next element hence j++
                    k--; // imagine K here 0,2,2,2,2 , k will reach will the first 2 bcz that's where nums[k]!=nums[k-1] according to the above while loop, but we actually need to go to the next element hence k--

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }



    public static List<List<Integer>> threeSum2(int[] nums) {

        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i+1; j < nums.length; j++) {
                int remaining = -(nums[i]+nums[j]);
                if (set.contains(remaining)){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(remaining);
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                }
                set.add(nums[j]);
            }
        }
        return resultSet.stream().toList();

    }


    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0 ){
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        Collections.sort(triplets);
                        System.out.println(triplets);
                        if (!ans.contains(triplets)){
                            ans.add(new ArrayList<>(triplets));
                        }
                    }
                }
            }
        }
        return ans;
    }

}
