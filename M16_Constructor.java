class Bike{
    int price;
    String name;
    Bike(){
        price = 999;
        name = "Duke";
    }
    Bike(int p,String n){
        price = p;
        name = n;
    }
}
class M16_Constructor{
    public static void main(String [] args){
        Bike b1 = new Bike();
        System.out.println(b1.name+" : $"+b1.price);
        Bike b2 = new Bike(1000,"Kawasaki H2R");
        System.out.println(b2.name+" : $"+b2.price);
    }
}