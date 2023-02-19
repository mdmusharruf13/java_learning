import java.util.ArrayList;
import java.util.Scanner;
public class ArrayRev_print {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("enter the size of the array :");
        int size = sc.nextInt();
        System.out.println("enter the elements into the array :");
        for(int i=0;i<size;i++){
            int value = sc.nextInt();
            al.add(value);
        }
        System.out.println("the array elements are :");
        for(int i=0;i<size;i++){
            System.out.println(al.get(i));
        }
        System.out.println("the array elements in reverse order are :");
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}

