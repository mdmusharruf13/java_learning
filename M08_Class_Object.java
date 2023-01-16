class Addition{
    public int add(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
}

class M08_Class_Object{
    public static void main(String [] args){
        Addition obj = new Addition();
        int result;
        result = obj.add(5,4);
        System.out.println(result);
    }
}
