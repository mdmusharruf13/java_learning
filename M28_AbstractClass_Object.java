abstract class Bike{
    public abstract void start();
}
class M28_AbstractClass_Object{
    public static void main(String [] args){
        Bike obj = new Bike(){
            public void start(){
                System.out.println("starting...");
            }
        };
        obj.start();
    }
}