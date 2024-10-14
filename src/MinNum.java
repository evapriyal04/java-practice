import java.util.Scanner;

//Create a program to find the minimum of two numbers.
public class MinNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        MinNum obj = new MinNum();
        int ans = obj.MiNternary(num1, num2);
        System.out.println("The minimum number is" + ans);


    }


    public int MiNternary(int num1, int num2) {
        return num1 < num2 ? num1 : num2;

    }
}



