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
public class M44_runnableInterface_lambdaExpression {
    public static void main(String [] args){
        Runnable obj1 = () ->{
            for(int i=0;i<5;i++){
                System.out.println("bus starting...");
                try{
                    Thread.sleep(4);
                }
                catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Runnable obj2 = () ->{
            for(int i=0;i<5;i++){
                System.out.println("truck starting...");
                try{
                    Thread.sleep(4);
                }
                catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // passing runnable object in thread constructor

        t1.start();
        t2.start();
    }
}
/*
Note : implementing thread by runnable interface using lambda expression.
        runnable interface will not have thread methods.
*/