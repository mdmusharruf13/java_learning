class Car extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in car...");
            try{
                Thread.sleep(3);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class Bike extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in bike...");
            try{
                Thread.sleep(3);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class M42_threads_sleep {
    public static void main(String [] args){
        Car obj1 = new Car();
        Bike obj2 = new Bike();

        obj1.start();
        obj2.start();
    }
}
/*
Note : inorder to use Thread.sleep() method you must use 
       try and catch else you will get error.
*/
