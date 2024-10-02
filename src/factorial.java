//Write a function that calculates the factorial of a given number.
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter for which number you want the factorial");
        int a = input.nextInt();
        System.out.println("The factorial of "+a+" is "+fact(a));
    }
    public static long fact(int num){
        long i=1;
        while(num>0){
            i *=num;
            num--;
        }
        return i;
    }
}
