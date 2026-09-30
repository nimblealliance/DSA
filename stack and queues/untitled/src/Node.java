public class Node {

    int key;
    int val;
    Node prev;
    Node next;
    int freq;

    public Node() {
        this.key = -1;
        this.val = -1;
        this.prev = null;
        this.next = null;
        this.freq=0;

    }

    public Node(int key , int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
        this.freq=0;
    }
}