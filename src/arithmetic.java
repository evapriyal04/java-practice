//create a program that takes two numbers and shows result of all arithmetic operators(+,-,/,%,*)
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args){
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
         num1=input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        int sum= num1+num2;
        int substraction=num1-num2;
        int division=num1/num2;
        int modulus=num1%num2;
        int multi=num1*num2;
        System.out.println("solution: "+sum);
        System.out.println("solution: "+substraction);
        System.out.println("solution: "+division);
        System.out.println("solution: "+modulus);
        System.out.println("solution: "+multi);
    }
}
