import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArr() {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("enter the number of elements you want in the array");
        size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        int i = 0;
        while (i < size) {
            System.out.print("Enter first element at index " + (i + 1) + ":");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static int[][] Array2d() {
        Scanner input = new Scanner(System.in);
        int rows, columns;
        System.out.println("enter the number of rows you want in the array");
        rows = input.nextInt();
        System.out.println("enter the number of columns you want in the array");
        columns = input.nextInt();
        int[][] arr2d = new int[rows][columns];
        System.out.println("Enter the elements of the array");
        int i = 0;
        while (i < rows) {  
            int j = 0;
            while (j < columns) {
                System.out.print("Enter first element at row" + (i + 1) + "\tand column" + (j + 1) + ":");
                arr2d[i][j] = input.nextInt();
                j++;
            }
            i++;

        }
        return arr2d;
    }
}
//int[] numArr= ArrayUtility.inputArr();