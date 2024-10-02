//Create a program to find the maximum and minimum element in an array.
import java.util.Scanner;

public class maxMIN {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter maximum 15 elements in the array");
        int i = 0;
        while (i < 5) {
            arr[i]=input.nextInt();
            i++;

        }
        int k = 0;
        int max =arr[0];
        int min=arr[1];
        while (k < arr.length) {
            if(arr[k]>max){
                max=arr[k];
            }
            if(arr[k]<min){
                min=arr[k];
            }
            k++;

        }
        System.out.println("MAX number "+max);
        System.out.println("Min number "+min);

    }
}