package Queue.LinearQueueUsingArray;

public class QueueFunctions {
        int queue[];
        int topInQueue;
        int FirstInQueue;
        QueueFunctions(int n){
            this.queue = new int[n];
            topInQueue = -1;
            FirstInQueue = -1;
            System.out.println("Queue of size " + n + " is Created");
        }
        public Boolean isEmpty(){
            if(topInQueue == -1 || topInQueue == queue.length){
                return true;
            }
            else{
                return false;
            }
        }

        public Boolean isFull(){
            if(topInQueue == queue.length-1){
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
                queue[topInQueue+1] = value;
                topInQueue = topInQueue+1;
                System.out.println("Your element successfully push in Queue");
            }
        }

        public int deQueue(){
            if(isEmpty() == true){
                return -1;
            }
            else{
                int x = FirstInQueue;
                FirstInQueue = FirstInQueue+1;
                if (FirstInQueue > topInQueue){
                    FirstInQueue = -1;
                    topInQueue = -1;
                }
                return queue[x];
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
