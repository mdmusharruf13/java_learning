import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class M49_TreeSet {
    public static void main(String [] args){

        Collection<Integer> num = new TreeSet<Integer>();
        num.add(58);
        num.add(30);
        num.add(10);
        num.add(98);
        num.add(30);
        System.out.println(num);
        
        Set<String> lang = new TreeSet<String>();
        lang.add("java");
        lang.add("cpp");
        lang.add("c");
        lang.add("python");
        lang.add("java");
        Iterator<String> name = lang.iterator();
        while(name.hasNext()){
            System.out.println(name.next());
        }
        
    }
}
/*
Note :
-> All the elements in the TreeSet will be sorted.
-> TreeSet does not contain duplicate elements.
*/