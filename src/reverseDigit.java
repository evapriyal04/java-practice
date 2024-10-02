import java.util.Scanner;

//Create a program to reverse the digits of a number.
public class reverseDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int a = input.nextInt();
        revnum(a);
    }
    public static void revnum(int num){
        int newnum=0;
        while(num>0){
            int rem=num%10;
             newnum= newnum*10+rem;
             num=num/10;

        }
        System.out.println("the reversed number is "+newnum);
    }
}
