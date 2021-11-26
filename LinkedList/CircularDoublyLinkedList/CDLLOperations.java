package LinkedList.CircularDoublyLinkedList;

public class CDLLOperations {
    public static void main(String[] args) {
        CircularDoublyLinkedListMethods c1 = new CircularDoublyLinkedListMethods();
        c1.insertAtFirst(1);
        c1.display();
        c1.insertAtFirst(2);
        c1.display();
        c1.insertAtFirst(3);
        c1.insertAtFirst(4);
        c1.display();
        c1.insertAtLast(5);
        c1.insertAtLast(6);
        c1.insertAtLast(7);
        c1.display();
        c1.insertAtAnyIndex(0,5);
        c1.display();
        c1.deleteAtFirst();
        c1.display();
        c1.deleteAtFirst();
        c1.display();
        c1.deleteAtLast();
        c1.display();
        c1.deleteAtLast();
        c1.display();
        c1.deleteAtAnyIndex(2);
        c1.display();
        c1.searchingElement(0);
        c1.searchingElement(10);
        c1.reverseDisplay();
    }
}
