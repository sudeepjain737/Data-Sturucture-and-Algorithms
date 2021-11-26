package Queue.LinearQueueUsingArray;

public class QueueOperations {
    public static void main(String[] args) {
        QueueFunctions f1 = new QueueFunctions(5);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        System.out.println(f1.peek());
        f1.enQueue(1);
        System.out.println(f1.peek());
        f1.enQueue(2);
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        f1.enQueue(3);
        f1.enQueue(4);
        f1.enQueue(5);
        f1.enQueue(6);
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
    }
}
