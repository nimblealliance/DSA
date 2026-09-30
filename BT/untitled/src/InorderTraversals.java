import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InorderTraversals {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(inorderRecursive(root));
        System.out.println(inorderIterative(root));

    }

    public static List<Integer> inorderRecursive(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        dfs(root , ans);
        return ans;
    }

    public static void dfs(TreeNode node , List<Integer> ans){
        if(node == null){
            return;
        }
        dfs(node.left , ans);
        ans.add(node.val);
        dfs(node.right , ans);
    }

    public static List<Integer> inorderIterative(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode node = root;

        while(node!= null || !st.isEmpty()){
            while(node != null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            ans.add(node.val);
            node = node.right;
        }
        return ans;
    }
}
