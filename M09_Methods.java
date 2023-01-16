class Computer{
    public void playGames(){
        System.out.println("playing games...");
    }
    public String openCalci(){
        return "opening calci...";
    }
    public int getSum(int n1,int n2){
        int result;
        result = n1+n2;
        return result;
    }
}

class M09_Methods{
    public static void main(String [] args){
        Computer obj = new Computer();
        obj.playGames();
        String str = obj.openCalci();
        int res = obj.getSum(5,9);
        System.out.println(res);
    }
}