class Student{
    String name;
    int year;
    static String language;
    
    static{
        language = "Java";
        System.out.println("static block...");
    }
    public Student(){
        name = "";
        year = 2022;
        System.out.println("constructor...");
    }

    public void show(){
        System.out.println(name+" "+language+" "+year);
    }
}
class M13_Static1{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Musharruf";
        s1.year = 2023;

        Student s2 = new Student();
    }
}
/* 
 conclusion : static block is only called once even if two or more object
 to a class is created but constructor is called each time when a object to 
 a class is created.
 static block is used to initialise static variables.
*/