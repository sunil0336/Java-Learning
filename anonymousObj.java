class A{

    public A(){
        System.out.println("This is in constuctor");
    }
    public void show(){
        System.out.println("this is show");
    }

}


public class anonymousObj {
    public static void main(String[] args) {

        //  new A(); // here is no refrence, anonymous obj

        new A().show(); // only use when we use only ones , u can't use agint it.
        
        // new A().show(); //if you use then it will create again new obj
    }
}
