class A{
    int age;
    public void show(){
        System.out.println("in show...");
    }
    class B{
        public void hide(){
            System.out.println("in hide...");
        }
    }
}
class M26_InnerClass{
    public static void main(String [] args){
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.hide();
    }
} 