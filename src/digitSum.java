//Create a program that computes the sum of the digits of an integer. 236= 2+3+6
//num%10=6  num/10=23
import java.util.Scanner;
public class digitSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        System.out.println("The sum of the digit "+a+" is "+numOf(a));
    }
    public static int numOf(int num) {
        int sum =0;
        while(num>0){
            int rem= num%10;// this gives remainder that is the last number
            sum+=rem;
            num= num/10;//this is used to give the quotient then you get the remainder of the quotient again
        }
        return sum;
    }

}

