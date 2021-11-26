package LinkedList.DoublyLinkedList;

public class DLLOperations {
    public static void main(String[] args) {
        DoublyLinkedListMethods d1 = new DoublyLinkedListMethods();
        d1.insertAtFirst(1);
        d1.insertAtFirst(2);
        d1.insertAtFirst(3);
        d1.insertAtLast(4);
        d1.insertAtLast(5);
        d1.insertAtLast(6);
        d1.display();
        d1.insertAtAnyIndex(20,4);
        d1.display();
        d1.insertAtAnyIndex(70,7);
        d1.display();
        d1.reverseDisplay();
        d1.deleteAtFirst();
        d1.display();
        d1.deleteAtLast();
        d1.display();
        d1.deleteAtAnyIndex(3);
        d1.display();
        d1.deleteAtAnyIndex(4);
        d1.display();
        d1.searchingElement(4);
        d1.searchingElement(0);
        d1.reverseDisplay();

    }
}
