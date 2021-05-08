public class Test {
    public static void main(String[] args) {
        Singly single = new Singly();
        single.print();
        single.add(10);
        single.add(20);
        single.add(30);
        single.print();
        single.add(2,50);
        single.print();
//        System.out.println("Size: "+single.size());
//        single.clear();
//        System.out.println(single.empty());
    }
}
