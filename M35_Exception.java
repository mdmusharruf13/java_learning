public class M35_Exception {
    public static void main(String [] args){
        int i=10;
        int j=0;
        int k;
        int arr [] = new int[5];
        try{
            // k=i/j;
            k=i/5;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("number divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }
        catch(Exception e){
            System.out.println("something went worng..."+e);
        }
        System.out.println("done...");
    }
}
