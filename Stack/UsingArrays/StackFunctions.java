package Stack.UsingArrays;

public class StackFunctions {
    int stack[];
    int topInStack;
    StackFunctions(int n){
        this.stack = new int[n];
        topInStack = -1;
        System.out.println("Stack of size " + n + " is Created");
    }
    public Boolean isEmpty(){
        if(topInStack == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean isFull(){
        if(topInStack == stack.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value){
        if(isFull() == true){
            System.out.println("Can't Push more Elements because Stack is Full");
        }
        else{
            stack[topInStack+1] = value;
            topInStack = topInStack+1;
            System.out.println("Your element successfully push in stack");
        }
    }

    public int pop(){
        if(isEmpty() == true){
            return -1;
        }
        else{
            int x = topInStack;
            topInStack = topInStack-1;
            return stack[x];
        }
    }

    public int peek(){
        return stack[topInStack];
    }

    public void delete(){
        stack = null;
        System.out.println("Your stack is deleted successfully");
    }
}
