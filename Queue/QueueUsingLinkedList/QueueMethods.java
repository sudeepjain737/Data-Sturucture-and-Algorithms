package Queue.QueueUsingLinkedList;

public class QueueMethods {
    Node head;
    Node tail;
    int size = 0;
    public void enQueue(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size = size+1;
        System.out.println("Your element successfully enqueue in Queue");
    }
    public int deQueue(){
        int c = -1;
        try {
            c = head.value;
            head = head.next;
        }catch (NullPointerException obj){
            return c;
        }
        size = size - 1;
        return c;
    }
    public int peek(){
        int c = -1;
        try {
            c = head.value;
        }catch (NullPointerException obj){
            return c;
        }
        return c;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else {
            return false;
        }
    }
    public void delete(){
        head = null;
        System.out.println("Your Queue is deleted successfully");
    }
}
