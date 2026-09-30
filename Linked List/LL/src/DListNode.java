public class DListNode {

    int val;
    DListNode next;
    DListNode prev;

    public DListNode(int val) {
        this.val = val;
        this.next=null;
    }

    public DListNode(int val, DListNode next , DListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
