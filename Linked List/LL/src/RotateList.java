public class RotateList {

    public static void main(String[] args) {

        ListNode ll = LLOps.convertLL(new int[]{1,2,3,4,5});
        int k = 10;
        ll = rotateRight(ll , k);
        LLOps.printList(ll);
    }


    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || k <= 1){
            return head;
        }

        int length = lengthOfLL(head);
        k = k % length;

        head = reverse(head);

        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        ListNode temp = head;
        ListNode currHead = temp;

        int count = 0;
        while (temp != null) {
            count++;

            if (count == k) {
                ListNode nextNode = temp.next;
                temp.next = null;

                ListNode reversedLL = reverse(currHead);
                ans.next = reversedLL;

                ListNode tailNode = currHead;
                tailNode.next = nextNode;

                ans = tailNode;
                temp = nextNode;
                currHead = temp;
                count = 0;
                break;
            } else {
                temp = temp.next;
            }

        }
        temp = reverse(temp);
        ans.next = temp;
        return dummy.next;

    }

    public static ListNode reverse(ListNode head) {
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

    public static int lengthOfLL(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}