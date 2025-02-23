// abstract class can have normal method abstract method or both also can have . also we can create multiple abstarct methods in one class 


abstract class Car{

    // 
    public abstract void drive();
    public abstract void reverse();

    public void playMusic(){
        System.out.println("playing music");
    }
}
// the tupe wegonr must implement the inherited abstact method car.drive    you need to define it compulsory otherwise it will ot work , override method

// if we inherits the abstract then you have to use abstract methods compulsory 

// if you don't want to use all abstract methods from parent class then you must declrare the WagonR class as abstract class
// prob is we cannot create obj of absract class
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving..");
    }


    // if you dont override this method then you will get this error -> WagonR is not abstract and does not override abstract method reverse() in Car

    public void reverse(){
        System.out.println("reversing ");
    }
}

class UpdatedWagonR extends WagonR{ // concrete class
    public void drive(){
        System.out.println("drive");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.reverse();
    }
}
