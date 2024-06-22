package DSA.Doubley_LinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleyLinkedList dll = new DoubleyLinkedList();
//        dll.addFirst(1);
//        dll.addFirst(2);
//        dll.addFirst(3);
//        dll.addFirst(4);
//        dll.addFirst(5);
//        dll.addFirst(6);

        dll.addAtEnd(1);
        dll.addAtEnd(2);
        dll.addAtEnd(3);
        dll.addAtEnd(4);
        dll.addAtEnd(5);
        dll.addAtEnd(6);
        dll.addHead(10);
        dll.display();
        dll.displayRev();
        dll.addTail(99);
        dll.display();
        dll.insertAtIndex(3,100);
        dll.display();
        dll.deleteAtIndex(4);
        dll.display();


    }
}
