package LinkedList.SinglyLinkedList;

public class SLLOperations {
    public static void main(String[] args) {
        SinglyLinkedListMethods s1 = new SinglyLinkedListMethods();
        s1.insertAtFirst(2);
        s1.insertAtFirst(3);
        s1.display();
        s1.insertAtFirst(4);
        s1.insertAtFirst(2);
        s1.display();
        s1.insertAtLast(1);
        s1.insertAtLast(2);
        s1.insertAtFirst(6);
        s1.display();
        s1.insertAtAnyPlace(10,3);
        s1.display();
        s1.deletionFromLast();
        s1.deletionFromFirst();
        s1.insertAtLast(2);
        s1.display();
        s1.deletionFromFirst();
        s1.display();
        s1.insertAtFirst(10);
        s1.insertAtFirst(20);
        s1.insertAtFirst(30);
        s1.display();
        s1.searchingElement(20);
        s1.searchingElement(90);
        s1.insertAtLast(40);
        s1.display();
        s1.display();
        s1.searchingElement(80);
        s1.searchingElement(21);
        s1.deletionFromAnyIndex(3);
        s1.display();
        s1.deletionFromFirst();
        s1.display();
        s1.deletionFromLast();
        s1.display();
        s1.insertAtLast(101);
        s1.display();
        s1.searchingElement(101);

    }
}
