package BigONotation;

public class ReverseOfArray {
    public void reverseArr(int[] arr){
        int temp;
        int j = arr.length-1;                               //------------------> O(1)
        for (int i = 0; i < arr.length/2; i++) {           //------------------> O(n/2)
            temp = arr[j];                                //------------------> O(1)
            arr[j] = arr[i];                             //------------------> O(1)
            arr[i] = temp;                              //------------------> O(1)
            j = j-1;                                   //------------------> O(1)
        }
        for (int i = 0; i < arr.length; i++) {          //------------------> O(n)
            System.out.print(arr[i] + " ");            //------------------> O(1)
        }
    }

    public static void main(String[] args) {
        ReverseOfArray r1 = new ReverseOfArray();
        r1.reverseArr(new int[] {1,2,3,4,5,6});
    }
}
/*
TIME COMPLEXITY = O(1)+O(n/2)+O(1)+O(1)+O(1)+O(1)+O(n)+O(1)
                = 6*O(1)+O(n)+O(n)
                = O(1)+2*O(n)
                = O(1)+O(n)
                = O(n)

 */