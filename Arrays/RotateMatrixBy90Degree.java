package Arrays;

public class RotateMatrixBy90Degree {
    public void rotateMatrix( int arr[][]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr[i].length-1; j >=0 ; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RotateMatrixBy90Degree r1 = new RotateMatrixBy90Degree();

        r1.rotateMatrix(new int [][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
