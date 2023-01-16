class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}

class M10_Method_overloading{
    public static void main(String [] args){
        Calculator obj = new Calculator();
        int result;
        result = obj.add(5,6);
        System.out.println(result);
        result = obj.add(4,5,6);
        System.out.println(result);
    }
}