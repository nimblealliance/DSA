import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class VerticalOrderTraversal {

    public ArrayList<ArrayList<Integer>> verticalOrder(TreeNode root) {

        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Deque<Pair> queue = new ArrayDeque<>();
        queue.offer(new Pair(root , 0));
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;


        while(!queue.isEmpty()){
            Pair currNode = queue.poll();
            int currCol = currNode.col;

            minCol = Math.min(minCol , currCol);
            maxCol = Math.max(maxCol , currCol);

            if(currNode.node.left!= null){
                queue.offer(new Pair(currNode.node.left , currCol-1));
            }

            if(currNode.node.right!= null){
                queue.offer(new Pair(currNode.node.right , currCol+1));
            }

            if(map.containsKey(currCol)){
                map.get(currCol).add(currNode.node.val);
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(currNode.node.val);
                map.put(currCol , list);
            }

        }

        for(int i= minCol ; i<=maxCol ; i++){
            ans.add(map.get(i));
        }

        return ans;
    }

}


class Pair{

    TreeNode node;
    int col;

    public Pair(TreeNode node , int col){
        this.node = node;
        this.col = col;
    }
}