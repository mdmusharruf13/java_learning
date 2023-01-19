final class Car{
    final int price = 500;
    // price = 200; //final variables cannot be modified
    public final void show(){
        System.out.println("price is "+price);
    }
}

/* // this class cannot inherit Car class because it is final class
class Electric_Car extends Car{
    
    // public void show(){
    //     System.out.println("this is electric car");
    // }
    public void close(){
        System.out.println("closing...");
    }
}*/

class M23_Final{
    public static void main(String [] args){
       Car obj = new Car();
        obj.show();
    }
}
/*
Note : 
final with variable : makes variable constant.
final with method : stops overriding.
final with class : stop inheritance.
*/