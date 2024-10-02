//Create a program to find the sum and average of all elements in an array.
public class sum_avg {
    public static void main(String[] args){
        int[] arr={4,5,7,17,3,5,9,5};
        int i =0,sum=0,k=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
            k+=1;
        }
        System.out.println("The sum of the elements in the array is "+sum);
        float avg=sum/k;
        System.out.println("The average of the elements in the array is "+avg);
    }
}
