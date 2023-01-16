class M04_Type_casting{
    public static void main(String[] args){
        /*
        Widening casting(automatically) - converting a smaller type to a larger type.
        byte->short->char->int->long->float->double

        Narrowing casting(manually) - converting a larger type to a smaller type.
        double->float->long->int->char->short->byte
        */

        //implicit type casting (auto)
        byte bt1 = 98;
        int num1 = bt1;
        System.out.println(bt1);
        System.out.println(num1);

        //explicit type casting (manual)
        int num2 = 120;
        byte bt2 = (byte)num2;
        System.out.println(bt2);
        System.out.println(num2);

        //explicit type casting with higher value
        int num3 = 257;
        byte bt3 = (byte)num3; 
        //divide number by range length of byte(-128 to 127 = 256) & remainder is stored 
        System.out.println(bt3);

        //type promotion
        byte n1 = 10;
        byte n2 = 20;
        int result = n1*n2; //200 (byte x byte = byte)
        System.out.println(result);
    }
}