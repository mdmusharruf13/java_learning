import java.util.Arrays;

public class ArraySort {
    public static void main(String [] args){
        int [] arr = {12,3,1,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println("the array elements are :"+arr[i]);
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("sorted array  :"+arr[i]);
        }

    }

}
