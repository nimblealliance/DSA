public class MiddleOFLL {
    public static void main(String[] args) {


    }


    public static ListNode middleMf(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
