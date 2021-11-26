package BigONotation;

public class ThreeArray {
    public void threeArr(int[] arr, int[] brr){
        for (int i = 0; i < arr.length; i++) {                          //------> O(a)
            for (int j = 0; j < brr.length; j++) {                     //-------> O(b)
                for (int k = 0; k < 100000; k++) {                    //--------> O(1)  because 100000 is a constant and all constant having O(1) time complexity
                    System.out.println(arr[i] + " " + brr[j]);       //---------> O(1)
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreeArray t1 = new ThreeArray();
        t1.threeArr(new int[] {1,2,3}, new int[] {1,3,4});
    }
}
/*

a = arr.length
b = brr.length

TIME COMPLEXITY = O(a)*O(b)+O(1)+O(1)
                = O(ab)+2*O(1)
                = O(ab)+O(1)
                = O(ab)
 */