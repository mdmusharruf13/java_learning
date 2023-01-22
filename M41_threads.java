class Car extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("car...");
        }
    }
}
class Bike extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("bike...");
        }
    }
}
public class M41_threads {
    public static void main(String [] args){
        Car obj1 = new Car();
        Bike obj2 = new Bike();

        obj1.start();
        obj2.start();
    }
}
/*
Note : thread can be implemented in two ways:
        1. extending the Thread class
        2. implementing Runnable interface
*/