import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(TSumBetter(nums));

    }

    public static List<List<Integer>> TSumOptimal(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        //-4,-1,0,1,1,2

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(List.of(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }


    public static List<List<Integer>> TSumBetter(int[] nums) {

        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int remaining = -(nums[i] + nums[j]);
                if (set.contains(remaining)) {
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

        public static List<List<Integer>> TSumBrute ( int[] nums){
            HashSet<List<Integer>> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {

                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = new ArrayList<>();
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            Collections.sort(triplet);
                            set.add(triplet);
                        }
                    }
                }
            }

            return set.stream().toList();
        }


}
