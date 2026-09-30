public class SerializeAndReverseMf {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right = new TreeNode(-10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        String serialmf = serialize(root);
        System.out.println(serialmf);
        System.out.println(deserialize(serialmf));

    }

    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        createStringBuilderFromNode(root , sb);
        return sb.toString();
    }

    public static void createStringBuilderFromNode(TreeNode node , StringBuilder sb){
        if(node == null){
            sb.append("#,");
            return;
        }

        sb.append(node.val);
        sb.append(",");

        createStringBuilderFromNode(node.left , sb);
        createStringBuilderFromNode(node.right , sb);
    }

    public static TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int[] index = {0};
        return createNodeFromString( nodes , index);
    }

    private static TreeNode createNodeFromString(String[] nodes , int[] index){
        if(nodes[index[0]].equals("#")){
            index[0]++;
            return null;
        }

        String val = nodes[index[0]];
        TreeNode node = new TreeNode(Integer.parseInt(val));
        index[0]++;

        node.left = createNodeFromString(nodes , index);
        node.right = createNodeFromString(nodes , index);

        return node;
    }
}
