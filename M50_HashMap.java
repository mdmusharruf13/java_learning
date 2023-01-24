import java.util.Map;
import java.util.HashMap;

public class M50_HashMap {
    public static void main(String [] args){
        
        Map<String, Integer> students = new HashMap<>();
        students.put("java", 98);
        students.put("Cpp", 97);
        students.put("Python", 90);
        students.put("C", 85);
        students.put("Swift", 91);
        System.out.println(students);

        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}
