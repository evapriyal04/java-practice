//Develop a program that prints the multiplication table for a given number.
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the multiplcation table");
        int a = input.nextInt();
        multi(a);

    }
    public static void multi(int num){
        int i =0;
        while(i<=12){
            int j =0;
             j = i*num;
            System.out.println(num+"*"+i+"="+j);
            i++;
        }
    }
}

