public class ConvertArrayToLL {

    public static ListNode convertLL(int[] arr){
        int n = arr.length;

        if(n == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for(int i=1 ; i<n ; i++){

            current.next = new ListNode(arr[i]); // create new ListNodes
            current = current.next; // keep moving the current
        }
        return head;
    }

    public static void printList(ListNode head){
        ListNode currentListNode = head;

        while(currentListNode!=null){
            System.out.print(currentListNode.data + " -> ");
            currentListNode = currentListNode.next;
        }
        System.out.println("null");
    }

    public static int lengthOfList(ListNode head){
        ListNode currentListNode = head;
        int count =0;
        while (currentListNode !=null){
            currentListNode = currentListNode.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,2,1};
        ListNode ListNode = convertLL(arr);
        printList(ListNode);
        System.out.println(lengthOfList(ListNode));
    }
}