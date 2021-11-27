package Stack.UsingLinkedList;

public class StackOperations {
    public static void main(String[] args) {
        StackFunctions s1 = new StackFunctions();
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        s1.push(1);
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
        s1.push(2);
        System.out.println(s1.peek());
        s1.push(3);
        System.out.println(s1.peek());
        s1.push(4);
        System.out.println(s1.peek());
        s1.push(5);
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
        s1.delete();
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
    }
}
