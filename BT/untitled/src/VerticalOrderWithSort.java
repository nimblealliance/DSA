import java.util.*;

public class VerticalOrderWithSort {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<int[]> list = new ArrayList<>();
        Deque<PairNode> q = new ArrayDeque<>();
        q.offer(new PairNode(root , 0 , 0));

        while(!q.isEmpty()){
            PairNode curr = q.poll();

            if(curr.node.left != null){
                q.offer(new PairNode(curr.node.left , curr.row+1 , curr.col -1));
            }

            if(curr.node.right != null){
                q.offer(new PairNode(curr.node.right , curr.row+1 , curr.col +1));
            }

            list.add(new int[]{curr.col  , curr.row , curr.node.val});
        }

        Collections.sort(list , (a , b) -> {

            if(a[0] != b[0]) {
                return a[0] - b[0];
            }

            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            return a[2] - b[2];
        });

        List<List<Integer>> ans = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for(int[] arr : list){
            if(arr[0] != prevCol){
                ans.add(new ArrayList<>());
                prevCol = arr[0];
            }

            ans.get(ans.size() -1).add(arr[2]);
        }
        return ans;
    }
}


class PairNode{
    TreeNode node;
    int row;
    int col;

    public PairNode(TreeNode node , int row , int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}