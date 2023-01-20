class Car{
    public void show(){
        System.out.println("in show method...");
    }
}
class M27_Anonymous_InnerClass{
    public static void main(String [] args){
        Car obj = new Car(){
            public void show(){
                System.out.println("in anonymous inner class...");
            }
        };
        
        obj.show();
    }
}