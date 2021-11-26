package Arrays;

public class IsUniqueArray {
    public void isUnique(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println("Array is not Unique");
                    return;
                }
            }
        }
        System.out.println("Array is Unique");
    }

    public static void main(String[] args) {
        IsUniqueArray i1 = new IsUniqueArray();
        i1.isUnique(new int[]{1,2,3,4,5});
        i1.isUnique(new int[]{1,2,3,4,5,5});
    }
}
