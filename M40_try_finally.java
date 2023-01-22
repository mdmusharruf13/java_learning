public class M40_try_finally {
    public static void main(String [] args) {
        try{
            int i = 40;
            i = i/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye...");
        }
    }
}
