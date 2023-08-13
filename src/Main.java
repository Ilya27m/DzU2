import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.display();
        l.removeO(4);
        l.display();
        l.removeO(1); //удаление головы
        l.display();


    }
}