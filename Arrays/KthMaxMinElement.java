package Arrays;

public class KthMaxMinElement {
    public void kthMaxMin(int [] arr,int k){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        System.out.println(k + "th Minimum in the array = " + arr[k-1]);
        System.out.println(k + "th Maximum in the array = " + arr[arr.length-k]);
    }

    public static void main(String[] args) {
        KthMaxMinElement k1 = new KthMaxMinElement();
        k1.kthMaxMin(new int[]{1,15,-1,10,40,100,20,50,-4,5},4);
    }
}
