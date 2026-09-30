import java.util.ArrayList;
import java.util.List;

public class PathFromRootToLeaf {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(allRootToLeaf(root));


    }

    public static List<List<Integer>> allRootToLeaf(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root , new ArrayList<>() , ans);
        return ans;
    }

    public static void dfs(TreeNode node , List<Integer> path ,List<List<Integer>> ans ){
        if(node == null) return;

        path.add(node.val);

        if(node.left == null && node.right == null){
            ans.add(new ArrayList<>(path));
        }

        dfs(node.left ,path , ans);
        dfs(node.right ,path , ans);
        path.remove(path.size() -1);
    }
}
