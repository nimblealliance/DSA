public class RemoveDupFromDLL {


    public DListNode removeDuplicates(DListNode head) {

        if(head==null || head.next== null){
            return head;
        }

        DListNode temp = head;

        while(temp!= null && temp.next!= null){
            DListNode nextNode = temp.next;

            while(nextNode != null && nextNode.next!=null && nextNode.val == temp.val){
                DListNode next = nextNode.next;
                next.prev = temp;
                temp.next = next;
                nextNode = next;
            }
            temp = temp.next;
        }
        return head;
    }

}


class Main {
    public static void printList(DListNode head) {
        DListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create a new node
    public static DListNode newNode(int data) {
        return new DListNode(data);
    }

    public static void main(String[] args) {
        // Creating a sorted doubly linked list:
        DListNode head = newNode(2);
        head.next = newNode(2);
        head.next.prev = head;
        head.next.next = newNode(2);
        head.next.next.prev = head.next;
        head.next.next.next = newNode(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = newNode(2);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = newNode(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = newNode(2);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        // Print original list
        System.out.print("Original list: ");
        printList(head);

        // Remove duplicates
        RemoveDupFromDLL sol = new RemoveDupFromDLL();
        head = sol.removeDuplicates(head);

        // Print modified list
        System.out.print("Modified list: ");
        printList(head);
    }
}
