import java.util.Set;
import java.util.HashSet;

class M48_HashSet{
    public static void main(String [] args){
        
        Set<Integer> num = new HashSet<Integer>();
        num.add(54);
        num.add(82);
        num.add(10);
        num.add(29);
        num.add(82);

        System.out.println(num);

        HashSet<String> names = new HashSet<String>();
        names.add("Mohammad");
        names.add("Musharruf");
        names.add("Nawaz");

        for(String name : names){
            System.out.println(name);
        }
    }
}
/*
Note : 
Set will not give the values in sorted format.
Set will not contain duplicate elements.
Set does not support index value.

This class implements the Set interface.it does not 
guarantee that the order will remain constant over time. 
This class permits the null element.

This class offers constant time performance for the 
basic operations (add, remove, contains and size).
*/