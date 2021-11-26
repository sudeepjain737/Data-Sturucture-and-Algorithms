package Arrays;

import java.util.Scanner;

public class InsertionAtAnyIndex {
    int arr[] = new int[100];
    Scanner input = new Scanner(System.in);
    int n1;
    public void array(){
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        n1 = n;
        System.out.println("Enter arrays elements");
        for (int i = 0; i < n1; i++) {
            arr[i] = input.nextInt();
        }
    }
    public void insert(int index ,int value) {
        if(index < 0 || index >= arr.length){
            System.out.println("Index Out of Range");
        }
        else{
            for (int i = n1; i >index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = value;
        }
        for (int i = 0; i < n1+1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionAtAnyIndex i1 = new InsertionAtAnyIndex();
        i1.array();
        i1.insert(0,3);
        }
    }

