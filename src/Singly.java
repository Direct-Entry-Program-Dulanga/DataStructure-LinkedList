public class Singly {

    //create first object
    private Node firstNode;
    private Node lastNode;

    public  void add(int number){
        Node newnode = new Node(number);
        if(firstNode==null){
            firstNode = newnode;
            lastNode = newnode;
        }else{
            lastNode.next = newnode;
            lastNode = newnode;
        }


    }

    public void add(int index,int number){

    }

    public void remove(int index){

    }

    public int get(int undex){
        return 0;
    }

    public void print(){
        Node currentNode = firstNode;
        if(firstNode == null){
            System.out.println("List of Empty");
            return;
        }
        System.out.print("Singly linked list: [ ");
        while (currentNode != null){

            System.out.print(currentNode.number + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");

    }


    public void clear(){

    }

    public int size(){
        return 0;
    }

    public boolean contains(int number){
        return true;
    }

    public boolean empty(){
        return false;
    }
}
