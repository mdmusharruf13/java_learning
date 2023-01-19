/*
                            ACCESS MODIFIERS
____________________________________________________________________
|                  |           |             |          |           |
|                  |  Private  |  Protected  |  Public  |  Default  |  
|__________________|___________|_____________|__________|___________|  
|                  |           |             |          |           |
|Same class        |    Yes    |     Yes     |    Yes   |    Yes    |      
|__________________|___________|_____________|__________|___________|        
|                  |           |             |          |           |
|Same package      |    No     |     Yes     |    Yes   |    Yes    |      
|subclass          |           |             |          |           |        
|__________________|___________|_____________|__________|___________|            
|                  |           |             |          |           |
|Same package      |    No     |     Yes     |    Yes   |    Yes    |      
|Non-subclass      |           |             |          |           |           
|__________________|___________|_____________|__________|___________|            
|                  |           |             |          |           |
|Different package |    No     |     Yes     |    Yes   |    No     |          
|subclass          |           |             |          |           |         
|__________________|___________|_____________|__________|___________|        
|                  |           |             |          |           |
|Different package |    No     |     No      |    Yes   |    No     |         
|non-subclass      |           |             |          |           |          
|__________________|___________|_____________|__________|___________|            
*/
// package java_learning;
class Truck{
    public int weight1 = 1000;
    protected String colour = "Black";
    public void show1(){
        System.out.println(weight1+" and "+colour);
    }
}
class Car extends Truck{
    private int weight2 = 500;
    public String name = "McLaren";
    public void show2(){
        System.out.println(weight2+" and "+colour+" "+name); 
        // colour(protected) is accessed because it is subclass  
    }
}
class Electric_Car extends Car{
    // int weight3 = weight2;
    
    /* 
    this code will throw an error because private variables 
    are accessed in the same class only
    */
    public void show3(){
        System.out.println(weight1+" "+name);
        // weight1 is accessed because of hierarchial inheritance
        // name is accessed from parent class 
    }
}
class M21_Access_Modifier{
    public static void main(String [] args){
        Truck t = new Truck();
        t.show1();
        Car c = new Car();
        c.show2();
        Electric_Car e = new Electric_Car();
        e.show3();
    }
}