public class Node {


        Node next;
        int number;

//    public Node() {
//    }

//    public Node(Node next, int number) {
//        this.next = next;
//        this.number = number;
//    }

    // Node object has two parts
    //there are 1. number integer variable 2. next - point or reference
    // begining of first node 'next' pointer/reference is null
    public Node(int number) {
        this.number = number;
        this.next = null;
    }

//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
}
