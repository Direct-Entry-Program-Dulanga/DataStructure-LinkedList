public class Node {


        private Node next;
        private int number;

    public Node() {
    }

    public Node(Node next, int number) {
        this.next = next;
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
