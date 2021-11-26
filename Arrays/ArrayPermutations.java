package Arrays;

public class ArrayPermutations {
    public void isPermutation(int arr[], int arr1[]){
        int s1 = 0, s2 = 0;
        int p1 = 1, p2 = 1;
        for (int i = 0; i < arr.length; i++) {
            s1 = s1 + arr[i];
            p1 = p1*arr[i];
            s2 = s2 + arr1[i];
            p2 = p2*arr1[i];
        }
        if(s1 == s2 && p1 == p2){
            System.out.println("Given arrays are permutation of each others");
        }
        else{
            System.out.println("Given arrays are not permutation of each others");
        }
    }

    public static void main(String[] args) {
        ArrayPermutations a1 = new ArrayPermutations();
        a1.isPermutation(new int[]{1,2,3,4,5,6},new int[]{4,3,5,1,2,6});
        a1.isPermutation(new int[]{1,2,4,5,3},new int[]{1,2,3,3,4});
    }
}
