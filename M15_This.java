class Mobile{
    private int price;
    private String colour; 
    public void setPrice(int price){
        this.price = price; 
        // this.price refers to instance variable and price refers to local variable.
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public int getPrice(){
        return price;
    }
    public String getColour(){
        return colour;
    }
}
class M15_This{
    public static void main(String [] args){
        Mobile obj = new Mobile();
        obj.setPrice(500);
        obj.setColour("White");
        System.out.println(obj.getColour()+" "+obj.getPrice());
    }
}