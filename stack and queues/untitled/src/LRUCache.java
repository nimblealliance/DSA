import java.util.HashMap;

class LRUCache {

    int capacity;
    HashMap<Integer, Node> map;
    Node dummyHead;
    Node dummyTail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        this.dummyHead = new Node();
        this.dummyTail = new Node();

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        moveNodeToFront(node); // since the element was accessed , move it to the front
        return node.val;
    }

    public void put(int key, int value) {

        Node node = map.get(key);

        if(node != null){ // if node is not null , that means it exists in DLL , so just move it to the front

            node.key = key;
            node.val = value;
            moveNodeToFront(node);
            map.put(key, node);

        } else {
            // if the node doesn't exists , we check the current capacity before adding the new node to the front
            if (map.size() == capacity) {
                removeNodeFromBack();
            }
            node = new Node(key , value);
            map.put(key , node);
            addNodeToFront(node);
        }
    }

    public void addNodeToFront(Node node){

        //use dummy head to get the currHead position
        Node currHead = dummyHead.next;

        //add the node between dummhead and currhead , then relink pointers
        dummyHead.next = node;
        node.prev = dummyHead;
        currHead.prev = node;
        node.next = currHead;
    }

    public void moveNodeToFront(Node node){

        //sever the node's old connections
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        //add the node to front
        addNodeToFront(node);
    }

    public void removeNodeFromBack(){

        //use dummy tail to get the currTail position
        Node currTail = dummyTail.prev;

        //add the new tail between currTail and dummyTail
        Node newTail = currTail.prev;
        newTail.next = dummyTail;
        dummyTail.prev = newTail;

        //then get rid of currTail
        currTail.prev = null;
        currTail.next = null;
        map.remove(currTail.key);
    }
}