class Car implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("car starting...");
            try{
                Thread.sleep(4);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class Bike implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("bike starting...");
            try{
                Thread.sleep(4);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class M43_threads_runnable {
    public static void main(String [] args){
        Runnable obj1 = new Car();
        Runnable obj2 = new Bike();
        // reference of interface and object of class

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // passing runnable object in thread constructor

        t1.start();
        t2.start();
    }
}
/*
Note : implementing thread by runnable interface.
        runnable interface will not have thread methods.
*/