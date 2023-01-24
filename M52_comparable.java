import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age="+age+", name="+name+"]";
    }

    public int compareTo(Students that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

class M52_comparable{
    public static void main(String[] args) {

        List<Students> std = new ArrayList<>();
        std.add(new Students(20, "Musharruf"));
        std.add(new Students(19, "Mohammad"));
        std.add(new Students(21, "Nawaz"));
        
        System.out.println("before sorting : ");
        for (Students s : std){
            System.out.println(s);
        }

        Collections.sort(std);
        
        System.out.println("after sorting : ");
        for (Students s : std){
            System.out.println(s);
        }
    }
}

