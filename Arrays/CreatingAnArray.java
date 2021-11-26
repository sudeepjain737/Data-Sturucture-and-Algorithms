package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingAnArray {
    int [] arr;
    public void declareArray(){
        arr = new int[5];
    //  int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }
    }
    public void showArray(){
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        CreatingAnArray c1 = new CreatingAnArray();
        c1.declareArray();
        c1.showArray();
    }

}
