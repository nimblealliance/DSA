import java.util.HashMap;

class LRUCache {

    HashMap<Integer , Node> map;
    int capacity;
    Node dummyHead;
    Node dummyTail;

    LRUCache(int capacity){

        this.capacity = capacity;
        this.map = new HashMap<>();

        dummyHead = new Node(-1 , -1);
        dummyTail = new Node(-1 , -1);

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }


    public int get(int key){
        Node node = map.get(key);

        if(node == null){
            return -1;
        }
        moveNodeToFront(node);
        return node.value;
    }

    public void put(int key , int value){
        Node node = map.get(key);

        if(node == null){

            if(map.size() == capacity){
                Node removedNode = deleteFromBack();
                map.remove(removedNode.key);
            }

            node = new Node(key , value);
            addNodeToFront(node);
            map.put(key , node);
            return;
        }

        node.value = value;
        moveNodeToFront(node);
        map.put(key , node);

    }

    public void moveNodeToFront(Node node){

        Node currPrev = node.prev;
        Node currNext = node.next;
        node.prev = null;
        node.next = null;

        currPrev.next = currNext;
        currNext.prev = currPrev;

        addNodeToFront(node);
    }

    public void addNodeToFront(Node node){
        node.next = dummyHead.next;
        dummyHead.next = node;
        node.prev = dummyHead;

    }

    public Node deleteFromBack(){
        Node currTail = dummyTail.prev;
        Node newTail = currTail.prev;

        currTail.next = null;
        currTail.prev = null;

        newTail.next = dummyTail;
        dummyTail.prev = newTail;

        return currTail;
    }
}

class Node{

    int key;
    int value;
    Node next;
    Node prev;

    Node(int key , int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;

    }
}

