class Calc{
    public int add(int x,int y){
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
}
class Adv_Calc extends Calc{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

class M18_Inheritance{
    public static void main(String [] args){
        Adv_Calc cal = new Adv_Calc();
        int r1 = cal.add(10,2);
        int r2 = cal.sub(10,2);
        int r3 = cal.mul(10,2);
        int r4 = cal.div(10,2);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}