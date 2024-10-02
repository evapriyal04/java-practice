//Create a program to sum all odd numbers from 1 to a specified number N.
import java.util.Scanner;
public class oddNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER until which number you want the sum");
        int a = input.nextInt();
        int total=oddSum(a);
        System.out.println("The total sum of the odd numbers is "+total);

    }
public static int oddSum(int num){
        int i =0;
        int sum =0;
        while(i<=num){
            if((i%2)!=0){
                sum+=i;
            }
            i++;
        }
        return sum;
}
}
