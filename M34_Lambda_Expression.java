@FunctionalInterface
interface Car{
    void start();
}
class M34_Lambda_Expression{
    public static void main(String [] args){
        Car obj = () ->{
            System.out.println("starting...");
        };
        obj.start();
    }
}
/*
Note : implementation of functional interface using 
lambda expression.
*/