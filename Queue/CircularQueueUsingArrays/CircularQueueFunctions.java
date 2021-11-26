package Queue.CircularQueueUsingArrays;

public class CircularQueueFunctions {
    int queue[];
    int topInQueue;
    int FirstInQueue;
    CircularQueueFunctions(int n){
        this.queue = new int[n];
        topInQueue = -1;
        FirstInQueue = -1;
        System.out.println("Queue of size " + n + " is Created");
    }
    public Boolean isEmpty(){
        if(topInQueue == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean isFull(){
        if((topInQueue == queue.length-1 && FirstInQueue == 0) || topInQueue == FirstInQueue-1){
            return true;
        }
        else {
            return false;
        }
    }
    public void enQueue(int value){
        if(isFull() == true){
            System.out.println("Can't Push more Elements because Queue is Full");
        }
        else if(isEmpty() == true){
            queue[topInQueue+1] = value;
            topInQueue = topInQueue+1;
            FirstInQueue = 0;
            System.out.println("Your element successfully push in Queue");
        }
        else{
            if(topInQueue+1 >= queue.length){
                topInQueue = (topInQueue+1) % queue.length;
                queue[topInQueue] = value;
            }
            else {
                queue[topInQueue + 1] = value;
                topInQueue = topInQueue + 1;
            }

                System.out.println("Your element successfully push in Queue");
        }
    }
    public int deQueue(){
        if(isEmpty() == true){
            return -1;
        }
        else {
            int x = queue[FirstInQueue];
            if(FirstInQueue == topInQueue){
                FirstInQueue = topInQueue = -1;
            }
            else if(FirstInQueue+1 == queue.length){
                FirstInQueue = 0;
            }
            else {
                FirstInQueue = FirstInQueue +1;
            }
            return x;
        }

    }
    public int peek() {
        if (isEmpty() == true) {
            return -1;
        } else {
            return queue[FirstInQueue];
        }
    }
    public void delete(){
        queue = null;
        System.out.println("Your stack is deleted successfully");
    }
}
