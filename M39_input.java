import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

class M39_input{
    public static void main(String [] args) throws IOException {

        System.out.println("Enter your name : ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String name = br.readLine();
        System.out.println("Hi,"+name);
        
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("your age is : "+age);
        sc.close();
    }
}