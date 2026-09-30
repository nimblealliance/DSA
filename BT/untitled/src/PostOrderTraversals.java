import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostOrderTraversals {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right = new TreeNode(-10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        System.out.println(postorderTraversalRecursive(root));
        System.out.println(postorderTraversalIterative(root));

    }

     public static List<Integer> postorderTraversalRecursive(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
         dfs(root, ans);
         return ans;
     }

     public static void dfs(TreeNode node, List<Integer> ans) {
         if (node == null) {
             return;
         }

         dfs(node.left, ans);
         dfs(node.right, ans);
         ans.add(node.val);

     }


    public static List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode node = root;
        TreeNode lastVisited = null;

        while(node!=null || !st.isEmpty()){
            while(node !=null){
                st.push(node);
                node = node.left;
            }

            TreeNode peek = st.peek();

            if(peek.right !=null && lastVisited != peek.right){
                node = peek.right;
            }
            else {
                ans.add(peek.val);
                lastVisited = st.pop();
            }
        }
        return ans;
    }


}
