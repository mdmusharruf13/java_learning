class Bike{
    Bike(){
        System.out.println("Constructor of bike...");
    }
    public void show(){
        System.out.println("In show method...");
    }
}
class M19_Anonymous_Object{
    public static void main(String [] args){
        new Bike(); // Anonymous object
        new Bike().show(); // another object calling a show()
    }
}