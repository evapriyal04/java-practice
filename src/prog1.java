//create a program to input name of the person and respond with "welcome NAME to kg coding
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Welcome "+ name +" to kg coding");

    }
}
