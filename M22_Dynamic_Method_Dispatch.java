class A{
    public void show(){
        System.out.println("in class A..");
    }
}
class B extends A{
    public void show(){
        System.out.println("in class B..");
    }
}
class C extends B{
    public void show(){
        System.out.println("in class C..");
    }
}
class M22_Dynamic_Method_Dispatch{
    public static void main(String [] args){
        A obj = new A();
        obj.show();

        obj = new B(); 
        obj.show();

        obj = new C();
        obj.show();
    }
}
/*Note : Dynamic method dispatch can only be implemened if there is inheirtance */