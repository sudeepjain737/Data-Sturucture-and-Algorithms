package Queue.CircularQueueUsingArrays;

public class CircularQueueOperations {
    public static void main(String[] args) {
        CircularQueueFunctions f1 = new CircularQueueFunctions(5);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.enQueue(1);
        System.out.println(f1.peek());
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.enQueue(2);
        System.out.println(f1.peek());
        f1.enQueue(3);
        System.out.println(f1.peek());
        f1.enQueue(4);
        System.out.println(f1.peek());
        f1.enQueue(5);
        System.out.println(f1.peek());
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        System.out.println(f1.deQueue());
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.enQueue(6);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.enQueue(7);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.peek());
        System.out.println(f1.deQueue());
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        System.out.println(f1.peek());

    }
}
