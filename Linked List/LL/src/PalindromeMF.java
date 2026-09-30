import java.util.ArrayList;

public class PalindromeMF {

    public static void main(String[] args) {

        ListNode ll = ConvertArrayToLL.convertLL(new int[]{1,2,3,4,3,2,1});
        System.out.println(isPalindrome2(ll));
    }


    public static boolean isPalindrome2(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow);
        ListNode first = head;
        ListNode second = newHead;

        while(second!=null){
            if(first.data != second.data){
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }


    public static ListNode reverse(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while(current!=null){
            ListNode node = current.next;
            current.next = prev;
            prev = current;
            current = node;
        }
        head = prev;
        return head;
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }

        int i=0;
        int j=list.size()-1;

        while(i<=j){
            if (list.get(i)==list.get(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
