@FunctionalInterface //this is anotation is required to mmake this interface as functional interface,
interface Laptop{
    void show();
    // void hide(); 
    /* this show2() method will throw error because
    Laptop is not a functional interface
    multiple non-overriding abstract methods found in interface Laptop*/
}

class M33_Functional_Interface{
    public static void main(String [] args){
        Laptop lap = new Laptop(){
            public void show(){
                System.out.println("showing...");
            }
            // public void hide(){
            //     System.out.println("hiding...");
            // }

        };
        lap.show();
        // lap.hide();
    }
}
/*
Note : An Interface that contains exactly one abstract 
method is known as functional interface.
*/