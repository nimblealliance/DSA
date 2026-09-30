public class ConvertArrToDLL {

    public static Node convertToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1 ; i< arr.length ; i++){
            Node temp = new Node(arr[i]);
            temp.back = prev;
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public static void printDLL(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        Node head = convertToDLL(arr);
        printDLL(head);

    }
}
