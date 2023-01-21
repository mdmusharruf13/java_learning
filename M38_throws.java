class Car{
    public void show() throws ClassNotFoundException{
        Class.forName("Bike");
        System.out.println("class is there...");
    }
}
public class M38_throws {
    public static void main(String [] args){
        try{
            Car obj = new Car();
            obj.show();
        }
        catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
Note : printStackTrace() method print all the exception from where it begins.
*/
