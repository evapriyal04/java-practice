import java.util.Scanner;

//Create a program to print the Fibonacci series up to a certain number.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a = input.nextInt();
        fib(a);
    }

    public static void fib(int num) {
        int num1 = 0;
        System.out.println(num1);
        int num2 = 1;


        while(num2<=num)

        {
            int num3 = num1 + num2;
            System.out.println(num3);
            num2 = num1;
            num1 = num3;

        }
    }

}