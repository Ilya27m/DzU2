public class MyLinkedList<E> {
    private class Node {
        public E element;
        public Node next;

        public Node(E element) {
            this.element = element;
            next = null;
        }

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public String toString() {
            return "Node = " + this.element.toString();
        }
    }

    private int size;
    private Node head;

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public E get(int index) {
        Node node = getNode(index);
        return node.element;
    }

    public int indexOf(Object obj) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (obj.equals(node.element)) return i;
            node = node.next;
        }
        return -1;
    }

    public boolean add(E element) {
        if (size == 0) {
            head = new Node(element);
            size++;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(element);
            size++;
        }
        return true;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0 ) {
           head = new Node(element,head);
        } else {
        Node node = getNode(index - 1);
        node.next = new Node(element, node.next);
        }
    }
    public  E removeI(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node node = null;
        if (size == 1) {
            node = head;
            head = null;
        } else if (index == 0) {
            node = head;
            head = head.next;
        } else if (index == size - 1) {
            node = getNode(size - 1);
           node.next = null;
        } else {
           Node currnode = getNode(index - 1);
            node = currnode.next;
            currnode.next = currnode.next.next;
        }
        size--;
        return node.element;
    }
    public  boolean removeO(Object obj) {
        int index = indexOf(obj);
        if (index != -1) {
            removeI(index);
            return true;
        }
        else return false;
    }
    public void display() {
        System.out.println("\n");
        System.out.println("Head is " + head.element);
        Node node = head;
        while (node != null) {
            System.out.println(node.element + " ");
            node = node.next;
        }
    }
}

