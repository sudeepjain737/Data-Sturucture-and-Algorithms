package BigONotation;

public class SumAndProductOfArray {
    int s = 0;                           //------------------------------------>  O(1)
    int p = 1;                          //------------------------------------->  O(1)
    public int sum(int [] arr){
        for (int i = 0; i < arr.length; i++) {  //-----------------------------> O(n)
            s = s + arr[i];            //--------------------------------------> O(1)
        }
        return s;                     //-------------------------------------->  O(1)
    }
    public int product(int [] arr){
        for (int i = 0; i < arr.length; i++) {  //-----------------------------> O(n)
            p = p*arr[i];            //----------------------------------------> O(1)
        }
        return p;                   //---------------------------------------->  O(1)
    }

    public static void main(String[] args) {
        SumAndProductOfArray p1 = new SumAndProductOfArray();
        System.out.println("SUM = " + p1.sum(new int[]{1,2,3,4,5}));   //------> O(1)
        System.out.println("PRODUCT = " + p1.product(new int[]{1,2,3,4,5}));//-> O(1)
    }
}
//  TOTAL TIME COMPLEXITY = O(1)+O(1)+O(n)+O(1)+O(1)+O(n)+O(1)+O(1)+O(1)+O(1)
//                        = 8*O(1)+2*O(n)
//                        = O(1) + O(n)
//                        = O(n)