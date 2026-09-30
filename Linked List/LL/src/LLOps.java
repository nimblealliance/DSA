public class LLOps {

    public static void main(String[] args) {

        int[] arr = {44,53,2,3,78,15,69,420};
        ListNode ll = convertLL(arr);

        printList(ll);
        ll=deleteHead(ll);
        printList(ll);
        ll=deleteTail(ll);
        printList(ll);
        ll=deleteKthElement(ll , 6);
        printList(ll);
        ll=insertAtHead(ll , 100);
        printList(ll);
        ll=insertAtTail(ll , 420);
        printList(ll);
        ll=insertAtKth(ll , 69420,100);
        printList(ll);
        ll=insertAtKth(ll , 69420,0);
        printList(ll);
        ll=insertAtKth(ll , 69420,4);
        printList(ll);
        ll=insertAtKth(ll , 69420,9);
        printList(ll);
    }

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


    public static ListNode deleteHead(ListNode head){
        if(head==null) return head;
        head = head.next;
        return head;
    }


    public static ListNode deleteTail(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode temp = head;
        while(temp.next.next!=null){ // iterate till you reach second last element
            temp = temp.next;
        }
        temp.next=null;
        return head;
    }

    public static ListNode deleteKthElement(ListNode head, int k){

        if (head == null) return null;

        if (k == 1){
            return deleteHead(head);
        }

        ListNode temp = head;
        int count = 0;
        ListNode previous = null;

        while(temp != null){
            count++;

            if (count ==k){
                previous.next = previous.next.next; //we're pointing previous element's pointer to current element's next element , thereby removing the current element
                break;
            }
            previous= temp;
            temp = temp.next;
        }
        return head;
    }


    public static ListNode insertAtHead(ListNode head , int data){
        return new ListNode(data , head);
    }

    public static ListNode insertAtTail(ListNode head , int data){
        if(head == null) return new ListNode(data);
        ListNode temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        ListNode newListNode = new ListNode(data , null);
        temp.next = newListNode;
        return head;
    }

    public static ListNode insertAtKth(ListNode head , int data , int k){
        if (head == null) return new ListNode(data);

        if (k == 1){
            return insertAtHead(head , data);
        }

        ListNode temp = head;
        int count=0;

        while(temp!=null){
            count++;
            if (count == k-1){
                ListNode newListNode = new ListNode(data);
                newListNode.next = temp.next;
                temp.next= newListNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

