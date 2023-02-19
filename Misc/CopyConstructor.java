public class CopyConstructor{
    private int roll;
    private String name;
    CopyConstructor(int rollno, String Name){
        roll = rollno;
        name = Name;
    }
    CopyConstructor(CopyConstructor Mush){
        roll = Mush.roll;
        name = Mush.name;
        System.out.println("\nthe copy constructor is invoked----\n");
    }
    String printName(){
        return name;
    }
    int printRoll(){
        return roll;
    }
    public static void main(String [] args){
        CopyConstructor m1 = new CopyConstructor (598,"Md Musharruf Nawaz");
        System.out.println("the name of the first student is :"+m1.printName());
        System.out.println("the roll no of the first student is :"+m1.printRoll());
        
        CopyConstructor m2 = new CopyConstructor(m1);
        System.out.println("the name of the first student is :"+m2.printName());
        System.out.println("the roll no of the first student is :"+m2.printRoll());
    }
}
