public class Main {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.add(7);
        l.add(9);
        l.add(6);
        l.add(1);
        l.add(8);
        l.display();
        l.removeO(8);
        l.display();

    }
}