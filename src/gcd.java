//Create a program to find the Greatest Common Divisor (GCD) of two integers.
import java.util.Scanner;
public class gcd {
       public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           System.out.println("enter two numbers to find the gcd");
           int a = input.nextInt();
           int b= input.nextInt();
           System.out.println("The gcd is 54 " + gcdNum(a, b));

       }

    public static int gcdNum(int m, int n) {
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
           }
           return m;
    }
}
