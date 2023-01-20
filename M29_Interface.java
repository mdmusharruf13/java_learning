interface Car{
    int price = 999; 
    String name = "ferrari";
    // variables in interface are by default final and static.

    void start();
    void stop();
    // methods in interface are by default public and abstract.
}
class Driver implements Car{
    public void start(){
        System.out.println("starting...");
    }
    public void stop(){
        System.out.println("stopping...");
    }
}
class M29_Interface{
    public static void main(String [] args){
        Driver obj = new Driver();
        obj.start();
        System.out.println(Car.name+" "+Car.price);
        obj.stop();
    }
}

/* 
Note : 
1. class - class -> extends
2. class - interface -> implements
3. interface - interface -> extends
*/