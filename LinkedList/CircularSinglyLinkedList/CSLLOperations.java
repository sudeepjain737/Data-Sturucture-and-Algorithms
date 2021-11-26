package LinkedList.CircularSinglyLinkedList;

public class CSLLOperations {
    public static void main(String[] args) {
        CircularSinglyLinkedListMethods c1 = new CircularSinglyLinkedListMethods();
        c1.insertAtFirst(20);
        c1.insertAtFirst(30);
        c1.display();
        c1.insertAtFirst(40);
        c1.display();
        c1.insertAtLast(50);
        c1.display();
        c1.insertAtLast(60);
        c1.display();
        c1.insertAtAnyIndex(1,0);
        c1.display();
        c1.insertAtAnyIndex(2,6);
        c1.display();
        c1.insertAtAnyIndex(3,3);
        c1.display();
        c1.deleteFromFirst();
        c1.display();
        c1.deleteFromFirst();
        c1.display();
        c1.deleteFromLast();
        c1.display();
        c1.deleteFromLast();
        c1.display();
        c1.insertAtLast(2);
        c1.display();
        c1.deleteFromAnyIndex(2);
        c1.display();
        c1.deleteFromAnyIndex(3);
        c1.display();
        c1.insertAtAnyIndex(20,3);
        c1.display();
        c1.searchingElement(10);
        c1.searchingElement(20);
    }
}
