import java.util.Scanner;

//create a program to add two numbers
public class prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= input.nextInt();
        System.out.println("Enter second number");
        int num2= input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
