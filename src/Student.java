//Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator (e.g.,
//High for scores > 80, Moderate for 50-80, Low for < 50).
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = input.nextInt();
        //here you are using a nested ternary operator
        String grade= marks>80?"high":(marks>=50?"moderate":"low");
        System.out.println("Your marks are in the range"+grade);
    }
}