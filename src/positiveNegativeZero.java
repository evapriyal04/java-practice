//Determine if a number is positive, negative, or zero
import java.util.Scanner;
public class positiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Determine if a number is positive, negative, or zero:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("The number\t" + num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number\t" + num + " is negative.");
        } else {
            System.out.println("The number\t" + num + " is zero.");
        }


    }

}
