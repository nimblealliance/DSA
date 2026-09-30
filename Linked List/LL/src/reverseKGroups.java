public class reverseKGroups {

    public static void main(String[] args) {

        ListNode ll = LLOps.convertLL(new int[]{1,2,3,4,5,6,7});
        int k = 3;
        LLOps.printList(ll);
        ll = reverseKGroup(ll,k);
        LLOps.printList(ll);
    }


    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        int count = 0;
        ListNode currHead = head;

        while (temp!= null){

            count++;

            if(count == k){
                ListNode nextNode = temp.next;
                temp.next = null;

                ListNode reversedLL = reverse(currHead);
                ans.next = reversedLL;

                ListNode tailNode = currHead;
                tailNode.next = nextNode;

                ans = tailNode;
                temp = nextNode;
                currHead = temp;
                count=0;

            }else {
                temp = temp.next;
            }
        }
        return dummy.next;
    }

    public static ListNode reverse(ListNode head){

        ListNode current = head;
        ListNode prev = null;

        while(current !=null) {
            ListNode newNode = current.next;
            current.next = prev;
            prev = current;
            current = newNode;
        }

        head = prev;
        return head;
    }
}
