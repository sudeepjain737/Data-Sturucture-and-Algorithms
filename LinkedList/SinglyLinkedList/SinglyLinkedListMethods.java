package LinkedList.SinglyLinkedList;

public class SinglyLinkedListMethods {
    public Node head;
    public Node tail;
    public int size = 0;
    public void insertAtFirst(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size = size+1;
    }
    public void insertAtLast(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size = size+1;
    }
    public void insertAtAnyPlace(int value,int index){
        Node node = new Node();
        node.value = value;
        node.next = null;
        if(index == 0){
            insertAtFirst(value);
        }
        else if(index == size){
            insertAtLast(value);
        }
        else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size = size+1;
    }

    public void deletionFromFirst() {
        try {
            head = head.next;
            size = size - 1;
        } catch (NullPointerException obj) {
            System.out.println(obj);
        }
    }

    public void deletionFromLast() {
        if (size == 1) {
            head = null;
            size = size - 1;
        } else if (size == 2) {
            head.next = null;
            size = size - 1;
        } else {
            try {
                Node temp = new Node();
                temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                size = size - 1;
            } catch (NullPointerException obj) {
                System.out.println(obj);
            }
        }
    }

    public void deletionFromAnyIndex(int index){
        if(index == 0){
            deletionFromFirst();
        }
        else if(index == size-1){
            deletionFromLast();
        }
        else{
            try {
                Node temp = new Node();
                temp = head;
                for (int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size = size-1;
            }
            catch (NullPointerException obj){
                System.out.println(obj);
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
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void size(){
        System.out.println("Size of Current LinkedList is: " + size);
    }

}

