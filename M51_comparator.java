import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class M51_comparator{
    public static void main(String[] args) {
       
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else 
                    return -1;
            } 
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(35);
        nums.add(30);
        nums.add(56);
        nums.add(65);
        System.out.print("before sorting : ");
        System.out.println(nums);

        Collections.sort(nums);
        
        System.out.print("after sorting : ");
        System.out.println(nums);
        
        Collections.sort(nums,com);
        System.out.print("sorting based on last digit : ");
        System.out.println(nums);
    }
}

