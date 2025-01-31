
class Human{
// usign obj anyone can access data 
    // int age;
    // String name;
    
//private = variable is accessible only in same class, outside we can't use it
// every time we create a instance variable make it private , using private from outside directly will not be accessed , only way to access them using methods 

    private int age = 22;
    private String name = "Sunil";

//binding data with methods 
// we encapsulate data in methods is alled as encapsulation 
    public int setAge(int a){
        return age = a;
    }

    public int getAge(){
        return age;
    }
// getting input / value from outside
    public String setName(String n){
        return name = n;
    }
    public String getName(){
        return name;
    }
}



public class Encapsulation {
    public static void main(String[] args) {
// usign obj anyone can access data 
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Rathod");

        // System.out.println(obj.name);
        System.out.println(obj.getName() + " : "+ obj.getAge());

    }
}


// privacy , no one should get ur data directly


