class M05_Operators{
    public static void main(String [] args){
        /**
        Unary Operator : prefix(++exp,--exp,+exp,-exp,~,!) and postfix(exp++,exp--).
        Arithmetic Operator : (*, /, %, +, -).
        Shift Operator : (<<, >>, >>>).
        Relational Operator : (<, >, <=, >=, instanceof, ==, !=).
        Bitwise Operator : (&, ^, |).
        Logical Operator : (&&, ||).
        Ternary Operator : (? :).
        Assignment Operator : (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=,>>>=).
        */

        int num1 = 15;
        int num2 = 5;
        System.out.println(++num1); // ++15 = 16
        System.out.println(num2++); // 5++ = 5

        int n1 = 10;
        int n2 = -10;
        System.out.println(~n1); //-11 (minus of total positive value which start from 0).
        System.out.println(~n2); // 9 (positive of total minus, positive start from 0).

        int result1 = num1+num2; // 15+5 = 20
        System.out.println(result1);

        System.out.println(10<<2); // 10*2^2=10*4=40
        System.out.println(10<<3); // 10*2^3=10*8=80
        System.out.println(10>>2); // 10/2^2=10/4=2
        System.out.println(20>>3); // 20/2^3=20/8=2

        int a=5,b=6;
        System.out.println(a>b); // 5>6 = false
        
        System.out.println(5&9); // 0101 & 1001 = 0001 (1)
        System.out.println(5|9); // 0101 | 1001 = 1101 (13) 
        System.out.println(5^9); // 0101 ^ 1001 = 1100 (12) 

        boolean c = a>6 && b==6;
        System.out.println(c);

        boolean d = a>6 || b==6;
        System.out.println(d);

        String stmt = (5>9)?"True...":"False.."; // (condition)?true:false;
        System.out.println(stmt);

        int x = 10;
        int y = 2;
        y+=x; // y = y+x = 10+2 = 12
        System.out.println(y);
    }
}