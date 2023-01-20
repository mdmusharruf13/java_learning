abstract class Car{ // abstract class
    public void start(){
        System.out.println("Starting...");
    }
    public abstract void fly();
    public abstract void stop();
}
abstract class Electric_car1 extends Car{ // abstract class
    public void fly(){
        System.out.println("flying...");
    }
}
class Electric_car2 extends Electric_car1{ // concrete class
    public void stop(){
        System.out.println("Stopping...");
    }
}
class M25_Abstract{
    public static void main(String [] args){
        Electric_car2 ec = new Electric_car2();
        ec.start();
        ec.fly();
        ec.stop();
    }
}
/*
Note : 
1. abstract class can have abstract methods and non-abstract methods.
2. body of abstract method is not defined.
3. we cannot create object of abstract class.
4. concrete class has an implementation for all of its method.
5. we can create object of concrete class.
*/