public class DLL {

    Node dummyHead;
    Node dummyTail;
    int size;

    public DLL(){
        this.dummyHead = new Node(-1 , -1);
        this.dummyTail = new Node(-1 , -1);

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;

        this.size = 0;
    }

    public void addToFront(Node node){

        //use dummy head to get the currHead position
        Node currHead = dummyHead.next;

        //add the node between dummyhead and currhead , then relink pointers
        dummyHead.next = node;
        node.prev = dummyHead;
        currHead.prev = node;
        node.next = currHead;
        size++;
    }

    public void removeNode(Node node){

        Node currPrev = node.prev;
        Node currNext = node.next;

        node.next = null;
        node.prev = null;
        currPrev.next = currNext;
        currNext.prev = currPrev;
        size--;
    }

    public Node removeNodeFromBack(){

        //use dummy tail to get the currTail position
        Node currTail = dummyTail.prev;

        //add the new tail between currTail and dummyTail
        Node newTail = currTail.prev;
        newTail.next = dummyTail;
        dummyTail.prev = newTail;

        //then get rid of currTail
        currTail.prev = null;
        currTail.next = null;

        size--;
        return currTail;
    }
}
