import java.util.ArrayList;
import java.util.List;

public class LCAMF {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        System.out.println(lowestCommonAncestor(root , p , q).val);


    }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pPath = new ArrayList<>();
        getPath(root , p , pPath);
        List<TreeNode> qPath = new ArrayList<>();
        getPath(root , q, qPath);

        //will check for LCA after this
        return root; // dummy return for now

    }


    public static void getPath(TreeNode node , TreeNode requiredNode , List<TreeNode> path){
        if(node == null) return;

        path.add(node);

        if(node == requiredNode) return;

        getPath(node.left , requiredNode , path);
        getPath(node.right , requiredNode , path);

        path.remove(path.size() -1);

    }
}
