class Counter{
    int count;
    public void increment(){
        count++;
    }
}
public class M45_thread_No_Synchronization{
    public static void main(String [] args) throws InterruptedException{

        Counter c = new Counter();
        
        Runnable obj1 = () ->{
            for(int i=1;i<=500;i++){
               c.increment();
            }
        };
        Runnable obj2 = () ->{
            for(int i=1;i<=500;i++){
                c.increment();
            }
        };
        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // passing runnable object in thread constructor

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
