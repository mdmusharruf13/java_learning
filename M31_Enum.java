enum Status{
    Running, Failed, Pending, Success;
}
class M31_Enum{
    public static void main(String [] args){
        Status s = Status.Success;
        System.out.println(s+"\n");

        Status ss[] = Status.values();
        for(Status m : ss){
            System.out.println(m+" : "+m.ordinal()+"\n");
        }

        switch(s){
            case Running:
                System.out.println("All Good...");
                break;
            case Failed:
                System.out.println("Try again...");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            default :
                System.out.println("Done...");
                break;
        }
    }
}