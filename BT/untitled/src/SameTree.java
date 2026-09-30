import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SameTree {

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);


        System.out.println(levelOrder(p));

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode node = root;

        queue.offer(node);
        boolean reversed = false;

        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i=0 ; i<size ; i++){

                if(!reversed){
                    node = queue.poll();

                    if(node.left!= null){
                        queue.offer(node.left);
                    }

                    if(node.right!= null){
                        queue.offer(node.right);
                    }

                    level.add(node.val);
                } else {
                    node = queue.pollLast();

                    if(node.right!= null){
                        queue.offerFirst(node.right);
                    }

                    if(node.left!= null){
                        queue.offerFirst(node.left);
                    }
                    level.add(node.val);
                }
            }
            ans.add(level);
            reversed = !reversed;
        }

        return ans;
    }

}
