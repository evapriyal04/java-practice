//Create a program to find the number of occurrences of an element in an array.
public class maxOccur {
    public static void main(String[] args){
        int[] arr={3,5,2,3,4,2,5,3,8,3,4};
        int ele=3;
        int i =0,k=0;
        while(i<arr.length){
            if(arr[i]==ele){
                k+=1;
            }
            i++;
        }
        System.out.println("the number of occurrences of an element in an array "+k);
        //it will print 11 because to show the user 11 elements are there but if you want to traverse through the
        //array u will put less than arr.length because the indexing starts from zero
        System.out.println(arr.length);
    }

}
