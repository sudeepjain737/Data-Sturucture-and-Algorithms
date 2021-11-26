package BigONotation;

public class NotAllPairs {
    public void notAllPairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        NotAllPairs n1 = new NotAllPairs();
        n1.notAllPairs(new int[]{1,2,3,4,5});
    }
}
/*

 Counting Iterations
 TIME COMPLEXITY = (n-1)+(n-2)+(n-3)+......3+2+1
                 = n*(n-1)/2
                 = (n^2)/2 - (n/2)
                 = (n^2)/2
                 = (n^2)
                 = O(n^2)


 */