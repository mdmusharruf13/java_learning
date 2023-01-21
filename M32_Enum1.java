enum Laptop{
    MacBook(200),XPS(2200),Surface,ThinkPad(1800);
    private int price;

    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
class M32_Enum1{
    public static void main(String [] args){
        
        Laptop lap = Laptop.MacBook;
        System.out.println(lap);
        System.out.println();

        for(Laptop l : Laptop.values()){
            System.out.println(l+" : "+l.getPrice());
        }
    }
}
