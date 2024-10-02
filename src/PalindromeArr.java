//Create a program to check if the array is a palindrome or not.
import java.util.Scanner;
public class PalindromeArr {
    public static void main(String[] args){
        int[] numarr=ArrayUtility.inputArr();
        boolean result=Pali(numarr);
        if(result){
            System.out.println("The array is a Palindrome");
        }
        else{
            System.out.println("The array is not Palindrome");
        }


    }
    public static boolean Pali(int[] arr){
        int i =0,j=arr.length-1;
        while(i<arr.length){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
