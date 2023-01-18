class Student{
    // private variables are accessed only in the same class
    private int roll = 98;
    private String name;

    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }

    public void setName(String n){
        name = n;
    }
}

class M14_Encapsulation{
    public static void main(String [] args){
        Student obj = new Student();
        // obj.name = "Musharruf"; // this code will throw an error
        obj.setName("Musharruf");
        System.out.println(obj.getName()+" : "+obj.getRoll());
    }
}

/* binding the data with the methods is called encapsulation.
in this program we are providing the private data through the methods*/