public class ReverseLL {


    public static void main(String[] args) {
        ListNode ll = ConvertArrayToLL.convertLL(new int[]{33, 22, 11, 1});
        LLOps.printList(ll);
        ll = reverseMF2(ll);
        LLOps.printList(ll);

    }

    public static ListNode reverseMF(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
        return head;
    }

    public static ListNode reverseMF2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newhead = reverseMF2(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;

    }

}