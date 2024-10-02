//Create a program to search an element in a 2-D array.
import java.util.Scanner;
public class Search2D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] array=ArrayUtility.Array2d();
        System.out.println("Enter the element you want to search");
        int ele=input.nextInt();
        boolean result=Searching(array,ele);
        if(result){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }


    }
    public static boolean Searching(int[][] Arr2,int ele){
        int i = 0;
        while(i<Arr2.length){
            int j=0;
            while(j<Arr2[i].length){
                if(Arr2[i][j]==ele) {
                    return true;

                }
                j++;

            }
            i++;
        }
        return true;
    }



}
