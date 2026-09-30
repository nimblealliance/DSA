public class DLLOps {

    public static void main(String[] args) {
        Node dll = ConvertArrToDLL.convertToDLL(new int[]{10,5,23,2,69,42,2});
        ConvertArrToDLL.printDLL(dll);
//        dll = deleteHead(dll);
//        ConvertArrToDLL.printDLL(dll);
//        dll = deleteTail(dll);
//        ConvertArrToDLL.printDLL(dll);
//        dll = deleteKthElement(dll,5);
//        ConvertArrToDLL.printDLL(dll);
//        dll=insertAtHead(dll,6);
//        ConvertArrToDLL.printDLL(dll);
//        dll=insertBeforeTail(dll,66);
//        ConvertArrToDLL.printDLL(dll);
//        dll=insertAtKthPosition(dll, 45,5);
//        ConvertArrToDLL.printDLL(dll);
//        dll=insertAtTail(dll,7);
//        ConvertArrToDLL.printDLL(dll);
        dll=reverseDLL(dll);
        ConvertArrToDLL.printDLL(dll);

    }

    public static Node deleteHead(Node head){
        if (head == null || head.next == null){
            return null;
        }

        head = head.next;
        head.back = null;
        return head;
    }

    public static Node deleteTail(Node head){

        if (head == null){
            return null;
        }

        if (head.back  == null && head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.back=null;
        temp.next= null;

        return head;
    }

    public static Node deleteKthElement(Node head , int k){

        if (head == null){
            return null;
        }

        Node temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            if (count == k){
                break;
            }
            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null){
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null){
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back=null;
        return head;
    }

    public static Node insertAtHead(Node head ,int data){

        Node newNode = new Node(data, head , null);
        head.back = newNode;
        head = newNode;
        return head;
    }

    public static Node insertBeforeTail(Node head , int data){

        Node temp = head;
        if (temp.next==null){
            return insertAtHead(head , data);
        }

        while (temp.next!=null){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next=temp;
        newNode.back=temp.back;
        temp.back.next=newNode;
        temp.back=newNode;
        return head;
    }

    public static Node insertAtTail(Node head , int data){
        if (head ==null){
            return new Node(data);
        }

        Node temp = head;

        while(temp.next!=null){
            temp= temp.next;
        }

        Node newNode = new Node(data,null, temp);
        temp.next=newNode;
        return head;
    }

    public static Node insertAtKthPosition(Node head , int data , int k){

        if (k==1){
            return insertAtHead(head , data);
        }

        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;

            if(count ==k){
                break;
            }
            temp=temp.next;
        }

        Node prev = temp.back;

        Node newNode = new Node(data,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;

    }

    public static Node reverseDLL(Node head){
        while(head!=null){
            Node temp = head;
            Node temp1 = temp.next;
            temp.next=temp.back;
            temp.back=temp1;
            head = head.next;
        }
        return head;
    }

}
