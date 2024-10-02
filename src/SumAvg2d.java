import java.util.Scanner;

public class SumAvg2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the 2D array
        int[][] array = new int[rows][columns];

        // Enter elements into the array
        System.out.println("Enter elements into the array:");
        int i = 0, j = 0;
        while (i < rows) {
            while (j < columns) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
                j++;
            }
            j = 0;
            i++;
        }

        // Calculate the sum and average
        int sum = 0;
        int totalElements = rows * columns;
        i = 0;
        j = 0;
        while (i < rows) {
            while (j < columns) {
                sum += array[i][j];
                j++;
            }
            j = 0;
            i++;
        }
        double average = (double) sum / totalElements;

        // Print the sum and average
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}
//import java.util.Scanner;
//
//public class TwoDimensionalArraySumAverageWhileLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Get the dimensions of the 2D array
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//        System.out.print("Enter the number of columns: ");
//        int columns = scanner.nextInt();
//
//        // Create the 2D array
//        int[][] array = new int[rows][columns];
//
//        // Enter elements into the array
//        System.out.println("Enter elements into the array:");
//        int i = 0, j = 0;
//        while (i < rows) {
//            while (j < columns) {
//                System.out.print("Enter element at [" + i + "][" + j + "]: ");
//                array[i][j] = scanner.nextInt();
//                j++;
//            }
//            j = 0;
//            i++;
//        }
//
//        // Calculate the sum and average
//        int sum = 0;
//        int totalElements = rows * columns;
//        i = 0;
//        j = 0;
//        while (i < rows) {
//            while (j < columns) {
//                sum += array[i][j];
//                j++;
//            }
//            j = 0;
//            i++;
//        }
//        double average = (double) sum / totalElements;
//
//        // Print the sum and average
//        System.out.println("Sum of all elements: " + sum);
//        System.out.println("Average of all elements: " + average);
//    }
//}

