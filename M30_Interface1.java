interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, rum in desktop");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, rum in laptop");
    }
}
class Devloper{
    public void DevApp(Computer sys){
        sys.code();
    }
}
class M30_Interface1{
    public static void main(String [] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Devloper mush = new Devloper();
        mush.DevApp(lap);
        mush.DevApp(desk);
    } 
}