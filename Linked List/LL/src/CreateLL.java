public class CreateLL {

    public static void main(String[] args) {

        Node n1 = new Node(2,null);
        Node n2 = new Node(12,null);
        Node n3 = new Node(22,null);
        Node n4 = new Node(32,null);
        Node n5 = new Node(42,null);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node head = n1;

        System.out.println(n1.data + " " + n1.next);
        System.out.println(n2.data + " " + n2.next);
        System.out.println(n3.data + " " + n3.next);
        System.out.println(n4.data + " " + n4.next);
        System.out.println(n5.data + " " + n5.next);
    }


    static class Node {

        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

}

