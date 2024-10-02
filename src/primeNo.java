//Create a program to check whether a given number is prime.
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        int num = input.nextInt();
        prime(num);
    }
    public static void prime(int a){
        int i=1;
        int sum=0;
        while(i<=a){
            if(a%i==0){
                sum+=1;
            }
            i++;
        }
        if(sum==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}

