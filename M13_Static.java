class Mobile{
    String name;
    int price;
    static String colour; // static variables are common for all

    public void show(){
        System.out.println(name+" "+price+" "+colour);
    }
}
class M13_Static{
    public static void main(String [] args){
        Mobile m1 = new Mobile();
        m1.name = "iphone 14 pro max";
        m1.price = 1200;
        // m1.colour = "white"; 
        // static variables are class variables & should be called with class only
        Mobile.colour = "white";// static variable is assigned 
        
        Mobile m2 = new Mobile();
        m2.name = "samsung s22 ultra";
        m2.price = 1100;
        // static variables are class variables & should be called with class only
        // m2.colour = "black"; 
        Mobile.colour = "black"; // static variable is modified

        m1.show();
        m2.show();
    }
}