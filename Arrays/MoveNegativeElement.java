package Arrays;

public class MoveNegativeElement {
    public void move(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j = j+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MoveNegativeElement m1 = new MoveNegativeElement();
        m1.move(new int[]{-7,-1,1,2,4,-3,4,-5,-6,1,0});
    }
}
