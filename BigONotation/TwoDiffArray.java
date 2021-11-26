package BigONotation;

public class TwoDiffArray {
    public void twoDiffArr(int[] arr , int[] brr){
        for (int i = 0; i < arr.length; i++) {                       //-------->  O(a)
            for (int j = 0; j < brr.length; j++) {                  //---------> O(b)
                if(arr[i]<brr[j]){                                 //----------> O(1)
                    System.out.println(arr[i] + " " + brr[j]);    //-----------> O(1)
                }
            }
        }
    }

    public static void main(String[] args) {
        TwoDiffArray t1 = new TwoDiffArray();
        t1.twoDiffArr(new int[]{1,2,3,4},new int[]{5,6,7,1});
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