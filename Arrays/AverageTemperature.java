package Arrays;

import java.util.Scanner;

public class AverageTemperature {
    int arr[];
    public float average;
    public float averageTemperature(){

        Scanner input = new Scanner(System.in);
        System.out.print("How many day's temperature? ");
        int n = input.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int j =i+1;
            System.out.print("Day " + j + "'s " + "high temp: ");
            arr[i] = input.nextInt();

        }
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        average = avg/arr.length;
        return average;
    }
    public int aboveAverageDays(){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > average){
                c = c+1;
            }
        }
        return c;
    }
    public void display(){
        System.out.println("Average = " + averageTemperature());
        System.out.println(aboveAverageDays() + " days above average");
    }

    public static void main(String[] args) {
        AverageTemperature a1 = new AverageTemperature();
        a1.display();
    }
}
