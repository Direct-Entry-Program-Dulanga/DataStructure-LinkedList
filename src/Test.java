public class Test {
    public static void main(String[] args) {
        Singly single = new Singly();
        single.print();
        single.add(10);
        single.add(20);
        single.add(30);
        single.print();
        System.out.println("");
        System.out.println("Get: "+single.get(2));
        single.add(2,50);
        single.print();
//        System.out.println("Size: "+single.size());
//        single.clear();
//        System.out.println(single.empty());
    }
}
