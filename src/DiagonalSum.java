import java.util.Scanner;

public class DiagonalSum {  // Start of class
    public static void main(String[] args) {  // Start of main method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 2d array in such a way that the rows and columns are equal");
        int[][] arr = ArrayUtility.Array2d();
        System.out.println("The sum of the diagonals is " + diesum(arr));
    }  // End of main method

    public static int diesum(int[][] array) {  // Start of diesum method
        int i = 0;
        int p = 0;
        int sum = 0;
        int k = array.length;
        int l = array[0].length;

        if (k != l) {
            return -1;
        }
            else{// Check if rows and columns are equal (square matrix)
            while (i < array.length) {
                int j = 0;
                while (j < array[i].length) {
                    if (i == j) {
                        sum += array[i][j];  // Main diagonal
                    }
                    j++;
                }
                i++;
            }
        }
        return sum;
    }  // End of diesum method
}  // End of class (This was missing)
