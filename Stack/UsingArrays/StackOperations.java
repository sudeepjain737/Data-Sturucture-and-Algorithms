package Stack.UsingArrays;

public class StackOperations {
    public static void main(String[] args) {
        StackFunctions f1 = new StackFunctions(5);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.push(1);
        System.out.println(f1.isEmpty());
        System.out.println(f1.isFull());
        f1.push(2);
        System.out.println(f1.peek());
        f1.push(3);
        System.out.println(f1.peek());
        f1.push(4);
        System.out.println(f1.peek());
        f1.push(5);
        System.out.println(f1.peek());
        f1.push(6);
        System.out.println(f1.peek());
        System.out.println(f1.isFull());
        System.out.println(f1.pop());
        System.out.println(f1.peek());
        System.out.println(f1.pop());
        System.out.println(f1.peek());
        f1.push(7);
        System.out.println(f1.peek());
        System.out.println(f1.isFull());
        f1.delete();
        System.out.println(f1.peek());

    }
}