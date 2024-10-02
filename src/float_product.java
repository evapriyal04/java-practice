//Create a program to calculate product of two floating points numbers.
import java.util.Scanner;
public class float_product {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two decimal numbers to find product");
        float a = input.nextFloat();
        float b= input.nextFloat();
        float sum=a*b;
        System.out.println("the product of\t"+a+"\tand\t"+b+"\tis\t"+sum);
    }
}
