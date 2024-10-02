//Create a program to check if the given array is sorted.
import java.util.Scanner;
public class Sort {
    public static void main(String[] args){
        int[] numArr= ArrayUtility.inputArr();
        boolean increase=isIncreasing(numArr);
        boolean decrease=isDecreasing(numArr);
        if (increase || decrease){
            System.out.println(" sorted");
        }
        else{
            System.out.println("sorted");
        }

    }
    public static boolean isIncreasing(int[] arr){
        //you should make sure it does not go less than zero
        int i =0;
        while(i<arr.length-1){
            if(arr[i]>=arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] abc) {
        int i = 0;
        while (i < abc.length-1) {
            if (abc[i]<=abc[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }


}
