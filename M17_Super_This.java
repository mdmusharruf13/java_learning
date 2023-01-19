class Bike{
    public Bike(){
        // super(); 
        // default constructor has by default super();
        System.out.println("Bike default");
    }
    public Bike(int n){
        this();
        System.out.println("Bike parameterized");
    }
}
class Car extends Bike{
    public Car(){
        // super();
        // default constructor has by default super();
        this(5);
        System.out.println("Car default");
    }
    public Car(int n){
        super(n);
        System.out.println("Car parameterized");
    }
}
class M17_Super_This{
    public static void main(String [] args){
        Car obj = new Car();
    }
}
/* 
note : this method execute first its own class constructor
 and super method execute its parent class constructor.
*/
