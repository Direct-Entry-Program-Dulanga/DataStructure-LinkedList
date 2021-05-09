public class Singly {

    //create first object
    private Node firstNode;
    private Node lastNode;
    int c = 0;

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
        Node newnode2 = new Node(number);
        if(index > size() || index < 0){
            throw new RuntimeException("Invalid linked exception");
        }
        for (int i = 0; i < size(); i++) {
                if(i < index){
                    firstNode.next = newnode2;
                }else if(i==index){
                    newnode2.next = lastNode;
                }
        }

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
        }
        System.out.print("Singly linked list: [ ");
        while (currentNode != null){
            System.out.print(currentNode.number + " ");
            currentNode = currentNode.next;
            c=c+1;
        }
        System.out.println("]");

    }


    public void clear(){
        lastNode = null;
        firstNode = null;
    }

    public int size(){
        return c;

    }

    public boolean contains(int number){
        return true;
    }

    public boolean empty(){
        return (firstNode == null);
    }
}
