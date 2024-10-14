import java.util.Scanner;

//Create a program to find if the given number is even or odd.
public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean result=OddEve(num);
        if (result){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }

    }
    public static boolean OddEve(int num){
        return num%2==0 ;
    }
}
