public class PathSum1 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);


        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(sol.hasPathSum(root , 22));
    }
}

class Solution {


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root , 0 , targetSum);
    }

    public boolean dfs(TreeNode node , int pathSum , int targetSum){

        if(node == null) return false;

        pathSum+=node.val;

        if(node.left== null && node.right == null) {
            return (pathSum == targetSum);
        }

        return dfs(node.left ,pathSum, targetSum) || dfs(node.right ,pathSum,  targetSum);
    }

}