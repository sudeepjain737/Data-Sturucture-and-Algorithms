package Queue.QueueUsingLinkedList;

public class QueueOperations {
    public static void main(String[] args) {
        QueueMethods q1 = new QueueMethods();
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
        q1.enQueue(1);
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
        q1.enQueue(2);
        System.out.println(q1.peek());
        q1.enQueue(3);
        System.out.println(q1.peek());
        q1.enQueue(4);
        System.out.println(q1.peek());
        q1.enQueue(5);
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
        System.out.println(q1.deQueue());
        System.out.println(q1.peek());
        System.out.println(q1.deQueue());
        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());
        q1.delete();
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
        System.out.println(q1.deQueue());

    }
}
