class M06_Conditions{
    public static void main(String[] args){
        int a = 5;
        int b = 30;

        // simple if conditioin
        if(a<b){
            System.out.println("a is less than b");
        }

        // if-else condition
        if(a>10){
            System.out.println("a is greater than 10");
        }
        else{
            System.out.println("a is less than 10");
        }

        // if else-if condition
        if(b<a){
            System.out.println("b is less than a");
        }
        else if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("both are equal");
        }

        // nested if else condition
        if(a<b){
            if(a%2==0){
                System.out.println("a is even number");
            }
            else{
                System.out.println("a is odd number");
            }
        }
        else{
            if(b%2==0){
                System.out.println("b is even number");
            }
            else{
                System.out.println("b is odd number");
            }
        }

        // ternary operator
        String res = (b>a)?"yes":"no";
        System.out.println(res);

        // switch 
        switch(a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}