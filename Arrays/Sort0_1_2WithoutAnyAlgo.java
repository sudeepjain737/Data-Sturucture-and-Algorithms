package Arrays;

public class Sort0_1_2WithoutAnyAlgo {
    public void separate(int[] arr){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count_0 = count_0+1;
            }
            else if(arr[i] == 1){
                count_1 = count_1+1;
            }
            else{
                count_2 = count_2+1;
            }
        }
        for (int i = 0; i < count_0; i++) {
            arr[i] = 0;
        }
        for (int i = count_0; i < count_0+count_1; i++) {
            arr[i] = 1;
        }
        for (int i = count_0+count_1; i < count_0+count_1+count_2; i++) {
            arr[i] = 2;
        }
        System.out.print("Final array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sort0_1_2WithoutAnyAlgo s1 = new Sort0_1_2WithoutAnyAlgo();
        s1.separate(new int[]{0,1,2,2,2,1,0,0,1,0,2,0,1});
    }
}
