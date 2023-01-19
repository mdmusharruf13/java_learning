class Bike{
    public void show(){
        System.out.println("Bike speed - 340 Kmph");
    }
    public void colour(){
        System.out.println("red colour");
    }
}
class Car extends Bike{
    public void show(){
        System.out.println("Car speed - 390 Kmph");
    }
}
class M20_Method_Overriding{
    public static void main(String [] args){
        Car obj = new Car();
        obj.show();
        obj.colour();
    }
}