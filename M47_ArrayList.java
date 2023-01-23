import java.util.List;
import java.util.ArrayList;

class M47_ArrayList{
    public static void main(String [] args){
        
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(8);
        num.add(10);
        num.add(2);

        System.out.println(num);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Mohammad");
        names.add("Musharruf");
        names.add("Nawaz");

        for(String name : names){
            System.out.println(name);
        }
    }
}