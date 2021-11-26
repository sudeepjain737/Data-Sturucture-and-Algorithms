package LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedListMethods {
    Node head;
    Node tail;
    int size = 0;

    public void insertAtFirst(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
            node.next = node;
            node.prev = node;
        }
        else{
            node.next = head;
            node.prev = tail;
            head.prev = node;
            head = node;
            tail.next = head;
        }
        size = size+1;
    }
    public void insertAtLast(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        node.prev = tail;
        tail.next = node;
        tail = node;
        head.prev = tail;
        size = size+1;
    }
    public void insertAtAnyIndex(int value , int index){
        if(index == 0){
            insertAtFirst(value);
        }
        else if(index == size){
            insertAtLast(value);
        }
        else {
            Node node = new Node();
            node.value = value;
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
            size = size+1;
        }
    }
    public void deleteAtFirst() {
        try {
            head.next.prev = tail;
            head = head.next;
            tail.next = head;
            size = size - 1;
        } catch (NullPointerException obj) {
            System.out.println(obj);
        }
    }
    public void deleteAtLast() {
        try {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size = size - 1;
        } catch (NullPointerException obj) {
            System.out.println(obj);
        }
    }
    public void deleteAtAnyIndex(int index){
        if(index == 0){
            deleteAtFirst();
        } else if (index == size - 1) {
            deleteAtLast();
        } else {
            try {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
                size = size - 1;
            } catch (NullPointerException obj) {
                System.out.println(obj);
            }
        }
    }
    public void searchingElement(int nodeValue){
        int c = 0;
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(node.value == nodeValue){
                c=1;
                break;
            }
            else{
                node = node.next;
            }
        }
        if(c==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public void size(){
        System.out.println("Size of Current LinkedList is: " + size);
    }
    public void reverseDisplay() {
        Node node = tail;
        try {
            while (node != head) {
                System.out.print(node.value + " ");
                node = node.prev;
            }
            System.out.println(head.value);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
