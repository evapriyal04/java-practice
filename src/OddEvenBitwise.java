//Write a program to check if a given number is even or odd using
//bitwise operators. to check if a number is odd or even after converting the number to binary operating system
/* you should check the right most number if it is 0 it is even and if it 1 it is odd.
so if it is 1100 you just need the last number so you have to ignore all the other numbers so you use num$1 so
it compares 1 ie 1111 with each part of that num .only one and one is one , if it is one and zero it is zero
 */
import java.util.Scanner;
public class OddEvenBitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        if ((num&1) ==1){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}
