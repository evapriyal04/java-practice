import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the number number of rows");
       int a = input.nextInt();
        pat_2(a);
    }
    public static void pat_2(int num ){
        int rows=num;
        while(rows>=0){
            System.out.print("*");
            int i =(rows-1);
            while(i>=0){
                System.out.print(" *");
                i--;
            }
            System.out.println(" ");
            rows--;
        }

    }
}


