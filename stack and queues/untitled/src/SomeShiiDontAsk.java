import java.util.HashMap;

public class SomeShiiDontAsk {

    int capacity;
    HashMap<Integer , Node > map ;
    Node dummyHead;
    Node dummyTail;

    public SomeShiiDontAsk(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        this.dummyHead = new Node();
        this.dummyTail = new Node();

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;

    }

    public int get(int key){
        Node node = map.get(key);

        if(node == null){
            return -1;
        }
        moveNodeToFront(node);
        return node.val;
    }

    public void put(int key , int value){
        Node node = map.get(key);

        if(node == null){
            node = new Node(key , value);

            if(map.size() == capacity){
                Node lru = removeFromBack();
                map.remove(lru.key);
            }

            addNodeToFront(node);
            map.put(key , node);
        }else {
            node.val = value;
            moveNodeToFront(node);
            map.put(key , node);
        }
    }

    public void addNodeToFront(Node node){
        Node currHead = dummyHead.next;
        node.next = currHead;
        node.prev = dummyHead;
        dummyHead.next = node;
        currHead.prev = node;
    }

    public void moveNodeToFront(Node node){

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        node.next = null;
        node.prev = null;

        addNodeToFront(node);
    }

    public Node removeFromBack(){
        Node currTail = dummyTail.prev;
        Node newTail = currTail.prev;
        currTail.prev = null;
        currTail.next = null;
        newTail.next = dummyTail;
        dummyTail.prev = newTail;
        return currTail;
    }


}
