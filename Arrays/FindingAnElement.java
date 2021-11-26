package Arrays;

import java.util.Scanner;

public class FindingAnElement {
        int[] arr;
        public void array(){
            arr = new int[]{1,2,3,4,5};
        }
        public void searchElement(int n){
            Scanner input = new Scanner(System.in);
            //System.out.print("Enter a number you want to search: ");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==n){
                    System.out.println("Given number is present in the array at index " + i);
                    return;
                }
            }
                System.out.println("Given number is not present in the array");
        }

        public static void main(String[] args) {
            Arrays.FindingAnElement f1 = new Arrays.FindingAnElement();
            f1.array();
            f1.searchElement(2);
            f1.searchElement(5);
            f1.searchElement(7);
        }

}
