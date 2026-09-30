public class ListNode {

    int data;
    ListNode next;
    ListNode child; // for flattening and merge k sorted list questions

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data, ListNode next, ListNode child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}
