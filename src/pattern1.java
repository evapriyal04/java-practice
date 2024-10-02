import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number number of rows");
        int a = input.nextInt();
        pat_1(a);
    }
    public static void pat_1(int num){
        int rows=1;
        while(rows<=num){
            System.out.print("*");

            int i=2;
            while(i<=rows){
                System.out.print(" *");
                i++;
            }
            System.out.println(" ");
            rows++;
        }

    }
}

