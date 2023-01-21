class MushException extends Exception{
    public MushException(String msg){
        super(msg);
    }
}
class M37_UserDefine_Exception{
    public static void main(String [] args){
        String name=null;
        try{
            if(name==null){
                throw new MushException("name is null.");
            }
        }
        catch(MushException me){
            System.out.println("Exception is : "+me);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}