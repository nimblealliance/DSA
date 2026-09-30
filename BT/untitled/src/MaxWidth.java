import java.util.ArrayDeque;
import java.util.Deque;

public class MaxWidth {

    public static void main(String[] args) {


    }


    // in this solution we assign count the nodes and assign indices to them and then count nodes in each level and return the max;

// We use Array representation of a complete binary tree to assign indices to nodes , root node is at index i , the left child is at (2*i + 1) and right child is at (2*i +2) . eg. root node at 0 its left and right are at 1 and 2 , for node eg. 2 , its left is at index 5 bcz (2*i + 1)  and right is at 6 bcz (2*i +2)

// we use index property along with node in Pair class then do level order traversal. this pair is inserted into the queue for level order traversal

// In level order traversal the queue will already have all nodes of a given level before it starts with that level , so we peek at the front Pair to get starting index , we peek at the last to get ending index and the width is last - first + 1 . We keep a track of maxWidth as well.

// Since we do not add nulls to the queue but they are accounted for in the array representation index anyway , we get correct results as the question is asking to get the length between the leftmost and rightmost non-null nodes .

    // so for eg, in a level like [null 5 3 null null null 7] , we have to start the count from 5 to 7 , we shouldn't include the first null but include the nulls in between 5 and 7 , with array representation 5 and 7 will be 6 distances apart as all nulls get indices as well but they aren't inserted into queue anyway
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        Deque<PairAgain> queue = new ArrayDeque<>();
        int maxWidth = 0;

        queue.offer(new PairAgain(root , 0));

        while(!queue.isEmpty()){
            int size = queue.size();

            int firstIndex = queue.peekFirst().index;
            int lastIndex = queue.peekLast().index;

            maxWidth = Math.max(maxWidth , lastIndex - firstIndex +1);

            for(int i=0 ; i<size ; i++){
                PairAgain curr = queue.poll();

                if(curr.node.left!=null){
                    queue.offer(new PairAgain(curr.node.left , 2*curr.index+1));
                }

                if(curr.node.right!=null){
                    queue.offer(new PairAgain(curr.node.right , 2*curr.index+2));
                }
            }
        }
        return maxWidth;
    }
}


class PairAgain{
    TreeNode node;
    int index;

    public PairAgain(TreeNode node , int index){
        this.node = node;
        this.index = index;
    }
}