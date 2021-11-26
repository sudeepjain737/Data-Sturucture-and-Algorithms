package BigONotation;

public class Pairs {
    public void pairs(int [] arr){
        for (int i = 0; i < arr.length; i++) {              //--------> O(n)
            for (int j = 0; j < arr.length; j++) {         //--------> O(n)
                System.out.println(arr[i] + " " + arr[j]); //--------> O(1)
            }
        }
    }

    public static void main(String[] args) {
        Pairs p1 = new Pairs();
        p1.pairs(new int[]{1,2,3,4});                   //-------> O(1)
    }
}
// TOTAL TIME COMPLEXITY = O(n)*O(n)+O(1)+O(1)
//                       = O(n^2)+2*O(1)
//                       = O(n^2)+O(1)
//                       = O(n^2)