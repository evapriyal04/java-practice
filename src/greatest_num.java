import java.util.Scanner;

/*Determine the greatest of three numbers:

Input: Three numbers
Output: The largest of the three numbers*/
public class greatest_num {
    public static void main(String[] args){
        System.out.println("enter three numbers:");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>=b && a>=c){
            System.out.println("The greatest number is\t"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("The greatest number is\t"+b);
        }
        else{
            System.out.println("The greatest number is\t"+c);
        }
    }
}
