package Arrays;

import java.util.Scanner;

public class SearchingElement {
    int[] arr;
    public void array(){
        arr = new int[]{1,2,3,4,5};
    }
    public void searchElement(int n){
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number you want to search: ");
        int d = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                c=c+1;
                d=i+1;
                break;
            }
        }
        if(c==1){
            System.out.println("Given number is present in the array at position " + d);
        }
        else{
            System.out.println("Given number is not present in the array");
        }
    }

    public static void main(String[] args) {
        SearchingElement s1 = new SearchingElement();
        s1.array();
        s1.searchElement(2);
        s1.searchElement(5);
        s1.searchElement(7);
    }
}
