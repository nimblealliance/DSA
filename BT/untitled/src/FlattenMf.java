import java.util.ArrayList;
import java.util.List;

public class FlattenMf {

    static TreeNode prev;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flatten(root);
        System.out.println(preOrder(root));
    }

    public static void flatten(TreeNode root) {

        if(root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.left = null;
        root.right = prev;
        prev = root;
    }


    public static List<Integer> preOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        dfs2(root , ans);
        return ans;
    }

    public static void dfs2(TreeNode node , List<Integer> ans){
        if(node == null){
            return;
        }
        ans.add(node.val);
        dfs2(node.left , ans);
        dfs2(node.right , ans);
    }
}
