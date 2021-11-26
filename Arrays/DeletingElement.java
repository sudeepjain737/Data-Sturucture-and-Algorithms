package Arrays;

import java.util.Scanner;

public class DeletingElement {
    int arr[] = new int[100];
    Scanner input = new Scanner(System.in);
    int n1;
    public void array(){
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        n1 = n;
        System.out.println("Enter arrays elements");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }
    public void deleteElement(int n){
        int d = -1;
        for (int i = 0; i < n1; i++) {
            if(arr[i] == n){
                d = i;
                break;
            }
        }
        if(d==-1){
            System.out.println("The element you want to delete is not present in the array");
        }
        else {
            for (int i = d; i < n1 - 1; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = 0; i < n1 - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        DeletingElement d1 = new DeletingElement();
        d1.array();
        d1.deleteElement(10);
    }
}
