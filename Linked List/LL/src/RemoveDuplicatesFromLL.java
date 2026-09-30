public class RemoveDuplicatesFromLL {

    public static void main(String[] args) {

        ListNode ll = LLOps.convertLL(new int[]{1, 1, 2, 3, 3});
        LLOps.printList(ll);
        ll = deleteDuplicates(ll);
        LLOps.printList(ll);

    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp!=null && temp.next!=null){

            ListNode nextNode = temp.next;

            while(nextNode!=null && nextNode.data == temp.data){
                ListNode next =  nextNode.next;
                temp.next = next;
                nextNode =  next;
            }
            temp = temp.next;

        }
        return head;
    }

}
