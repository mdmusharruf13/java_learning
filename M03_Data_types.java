class M03_Data_types{
    public static void main(String [] args){
        /*
        Note : byte, short, int and long stores whole numbers.
        byte : 1 byte - range (-128 to 127).
        short : 2 bytes - range (-32,768 to 32,767).
        int : 4 bytes - range (-2,147,483,648 to 2,147,483,647).
        long : 8 bytes - range (-9,223,372,036,854,775,808 to 
                                    9,223,372,036,854,775,807)

        Note : float and double stores fractional numbers.
        float : 4 bytes - storing 6 to 7 decimal digits.
        double : 8 bytes - storing 15 decimal digits.

        char : 2 bytes - single character/letter or ASCII value.
        
        boolean : 1 bit - stores true or false values.
        
        String : Non-primitive data type. 
        */

        byte bt = 127;
        short st = 32767;
        int num1 = 2147483647;
        long num2 = 9223372036854775807L;
        float num3 = 5.1234567f;
        double num4 = 3.1234567891012345;
        char c = 'm';
        String str = "Java";
        System.out.println(bt);
        System.out.println(st);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(c);
        System.out.println(str);
    }
}