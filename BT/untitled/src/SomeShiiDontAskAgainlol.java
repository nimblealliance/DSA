import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SomeShiiDontAskAgainlol {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right = new TreeNode(-10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(postorder(root));

    }


    public static List<Integer> postorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode node = root;
        TreeNode lastVisited = null;

        while(node!=null || !st.isEmpty()){
            while(node!=null){
                st.push(node);
                node = node.left;
            }

            TreeNode peek = st.peek();

            if(peek.right!= null && peek.right != lastVisited){
                node = peek.right;
            }else {
                peek = st.pop();
                ans.add(peek.val);
                lastVisited = peek;
            }
        }
        return ans;
    }
}



