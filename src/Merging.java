//Create a program to merge two sorted arrays.
public class Merging {
    public static void main(String[] args){
        System.out.println("Enter first sorted array");
        int[] arr1= ArrayUtility.inputArr();
        System.out.println("Enter second sorted array");
        int[] arr2= ArrayUtility.inputArr();
        int[] merged_array=Merger(arr1,arr2);
        //Display merged array
        System.out.println(" Elements of the merged array");
        int i=0;
        while(i<merged_array.length){
            System.out.print("\t"+merged_array[i]);
            i++;
        }


    }
    public static int[] Merger(int[] array1,int[] array2){
        int size = array1.length+array2.length;
        int[] mergearr=new int[size];
        int i=0,j=0,k=0;
        while(i<array1.length&&j<array2.length){
            if(array1[i]<= array2[j]){
                mergearr[k]=array1[i];
                i++;

            }
            else{
                mergearr[k]=array2[j];
                j++;

            }
            k++;
        }
        while(i<array1.length){
            mergearr[k]=array1[i];
            i++;
            k++;
        }
        while(j<array2.length){
            mergearr[k]=array2[j];
            j++;
            k++;
        }
        return mergearr;

    }
}
