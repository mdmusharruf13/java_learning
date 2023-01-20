class A{
    public void show1(){
        System.out.println("in A's method");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B's method");
    }
}

class M24_UpCasting_DownCasting{
    public static void main(String [] args){
        A obj1 = (A) new B(); // up casting
        obj1.show1();

        B obj2 = (B) obj1; // down casting
        obj2.show2();
    }
}
