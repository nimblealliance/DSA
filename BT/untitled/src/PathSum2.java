import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);


        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(pathSum(root , 22));

    }


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root , 0 , targetSum , new ArrayList<>() , ans);
        return ans;
    }

    public static void dfs(TreeNode node , int pathSum , int targetSum , List<Integer> temp , List<List<Integer>> ans){

        if(node == null) return;

        pathSum+=node.val;
        temp.add(node.val);

        if(node.left == null && node.right == null && pathSum == targetSum){
            ans.add(new ArrayList<>(temp));
        }

        dfs(node.left , pathSum , targetSum , temp , ans);
        dfs(node.right , pathSum , targetSum , temp , ans);
        pathSum-=node.val;
        temp.remove(temp.size()-1);
    }
}
