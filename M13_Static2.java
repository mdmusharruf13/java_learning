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
        System.out.println("constructor...\n");
    }

    public void show(){
        System.out.println(name+" "+language+" "+year+"\n");
    }

    public static void showing(){
        System.out.println("this is static method calling from a static method\n");
    }
    
    public static void display(Student obj){ // obj is of student type.
    // you can access non static variables with the help of object of that class
        System.out.println(obj.name+" "+language+" "+obj.year);
        System.out.println("in static method...\n");
    }
}
class M13_Static2{
    public static void main(String [] args){
        Student s1 = new Student(); 
        //object is created static block and constructor is called.
        s1.name = "Musharruf";
        s1.year = 2023;
        s1.show();

        Student.showing(); 
        // you can call a static method from another static method without creating object.
        
        // Student.show(); // this code will throw an error.
        // non-static method show() cannot be referenced from a static context.

        // you can call static method by passing object of that class.
        Student.display(s1);
    }
}