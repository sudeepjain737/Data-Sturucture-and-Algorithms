package Stack.UsingLinkedList;

public class StackFunctions {
    Node head;
    Node tail;
    int size = 0;
    public void push(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        System.out.println("Your element successfully push in stack");
        size = size+1;
    }

    public int pop(){
        int c = -1;
        try{
            c = head.value;
            head = head.next;
        }catch (NullPointerException obj){
            return c;
        }
        size =size-1;
        return c;
    }
    public int peek(){
        try {
            return head.value;
        }catch (NullPointerException obj){
            return -1;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void delete(){
        head = null;
        System.out.println("Your stack is deleted successfully");
    }

}
