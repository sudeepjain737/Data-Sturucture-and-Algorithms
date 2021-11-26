package LinkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedListMethods {
    public Node head;
    public Node tail;
    public int size = 0;
    public void insertAtFirst(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        size =size+1;
    }
    public void insertAtLast(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
            tail = node;
        }
        size = size+1;

    }
    public void insertAtAnyIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
        }
        else if(index == size){
            insertAtLast(value);
        }
        else {
            Node node = new Node();
            node.next = null;
            node.value = value;
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size = size+1;
        }
    }
    public void deleteFromFirst(){
        try {
            head = head.next;
            tail.next = head;
            size = size-1;
        }
        catch (NullPointerException obj){
            System.out.println(obj);
        }
    }
    public void deleteFromLast() {
        Node temp = head;
        try {
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            size = size - 1;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    public void deleteFromAnyIndex(int index){
        if(index == 0){
            deleteFromFirst();
        }
        else if(index == size-1){
            deleteFromLast();
        }
        else {
            try {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size = size - 1;
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
    }
    public void searchingElement(int nodeValue){
        int c = 0;
        Node node = new Node();
        node = head;
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
    public void display(){
        Node temp = new Node();
        temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
