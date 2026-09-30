public class DiameterMF {

    int diameter = 0;

    public  int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public int dfs(TreeNode node){
        if(node == null) return 0;

        int left = diameterOfBinaryTree(node.left);
        int right = diameterOfBinaryTree(node.right);

        diameter = Math.max(diameter , left+right);

        return 1+Math.max(left,right);
    }
}
