//Armstrong number
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int a = input.nextInt();
        armnum(a);
    }
    public static void armnum(int num){
        int abc = num;
        int sum=0;
        while(num>0){
            int rem = num%10;
             sum=sum+(rem*rem*rem);
             num = num/10;
        }
        if (sum==abc){
            System.out.println("The number is an armstrong number");
        }
        else{
            System.out.println("The number is not an armstrong number");
        }
    }
}
