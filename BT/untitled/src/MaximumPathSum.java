public class MaximumPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode node){
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftMax = Math.max(0 , left);
        int rightMax = Math.max(0 , right);

        maxSum = Math.max(maxSum , node.val+leftMax+rightMax);

        return node.val+Math.max(leftMax , rightMax);
    }


}
