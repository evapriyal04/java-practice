//Create a program to return a new array deleting a specific element.
import java.util.Scanner;
public class DelNum {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter new array");
        int[] numarr = ArrayUtility.inputArr();
        System.out.println("Enter the number to be deleted from the array");
        int ele=abc.nextInt();
        int occur=occurence(numarr,ele);
        int[] new_array= Del(numarr, ele,occur);
        System.out.println(" elements of the new array");
        int i=0;
        while(i<(numarr.length-occur)){
            System.out.println(new_array[i]);

            i++;
        }


    }
    public static int[] Del(int[] arr,int element,int length){
        int i = 0,j=0;
        int k=0;
        int[] newar= new int[arr.length-length];
        while(i<arr.length){
            if(arr[i]==element){
                k+=1;
            }
            else{
                newar[j]=arr[i];
                j++;
            }
            i++;

        }
        return newar;
    }
    public static int occurence(int arr[],int element){
        int i =0,k=0;
        while(i<arr.length){
            if(arr[i]==element){
                k+=1;
            }
            i++;
        }
        return k;
    }

}
