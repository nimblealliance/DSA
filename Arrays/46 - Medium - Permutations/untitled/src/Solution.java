import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean[] used = new boolean[nums.length];
        List<Integer> path = new ArrayList<>();
        System.out.println("Starting backtracking...\n");
        backtrack(nums, path, used, 0);
    }

    private static void backtrack(int[] nums, List<Integer> path, boolean[] used, int depth) {
        // Indent for clarity in output
        String indent = "  ".repeat(depth);

        if (path.size() == nums.length) {
            System.out.println(indent + "✅ Found permutation: " + path);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                System.out.println(indent + "Skipping used: " + nums[i]);
                continue;
            }

            // Choose
            path.add(nums[i]);
            used[i] = true;
            System.out.println(indent + "→ Add: " + nums[i] + " → " + path);

            // Explore
            backtrack(nums, path, used, depth + 1);

            // Un-choose (Backtrack)
            int removed = path.remove(path.size() - 1);
            used[i] = false;
            System.out.println(indent + "← Remove: " + removed + " → " + path);
        }
    }
}
