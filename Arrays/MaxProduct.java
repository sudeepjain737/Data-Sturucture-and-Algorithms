package Arrays;

public class MaxProduct {
    int arr[] = new int[]{1,2,6,4,5,7};
    public void maxProduct(){
        int d = -1 ,e = -1, c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(c < arr[i]*arr[j]){
                    c = arr[i]*arr[j];
                    d = arr[i];
                    e = arr[j];
                }
            }
        }
        System.out.println(d + " " + e);
    }

    public static void main(String[] args) {
        MaxProduct m1 = new MaxProduct();
        m1.maxProduct();
    }
}
