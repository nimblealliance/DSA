import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreOrderTraversals {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(preorderTraversalRecursive(root));
        System.out.println(preorderTraversalIterative(root));

    }

    public static List<Integer> preorderTraversalRecursive(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        dfs(root , ans);
        return ans;
    }

    public static void dfs(TreeNode node , List<Integer> ans){
        if(node == null){
            return;
        }

        ans.add(node.val);
        dfs(node.left , ans);
        dfs(node.right , ans);
    }

    public static List<Integer> preorderTraversalIterative(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode node = root;

        while(node!= null || !st.isEmpty()){
            while(node != null) {
                ans.add(node.val);
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            node = node.right;
        }
        return ans;
    }

}
