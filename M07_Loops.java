class M07_Loops{
    public static void main(String [] args){
        int num1 = 3;

        // for loop
        for(int i=0; i<num1; i++){
            System.out.println("Java is the best language");
        }

        // while loop
        while(num1>0){
            System.out.println("Hi, learners!");
            num1--;
        }

        // do-while loop
        do{
            System.out.println("Bye....");
            num1++;
        }while(num1<3);
        
    }
}