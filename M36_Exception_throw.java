public class M36_Exception_throw {
    public static void main(String [] args){
        int i=15;
        int j=0;
        String name=null;
        try{
            // if(name==null){
            //     throw new NullPointerException("length is zero");    
            // }
            if(j==0){
                throw new ArithmeticException("cannot be divided by zero");
            }
            i=10/j;
        }
        catch(NullPointerException ne){
            System.out.println("the exception is "+ne);
        }
        catch(ArithmeticException ae){
            System.out.println("the exception is "+ae);
        }
        catch(Exception e){
            System.out.println("something went wrong..."+e);
        }
    }
}
