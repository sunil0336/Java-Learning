class A{
    public void show1(){
        System.out.println("this is show1 ");
    }
}
class B extends A{
    public void show2(){
        System.out.println("this is show2 ");
    }
}

public class upcasting {
    public static void main(String[] args) {
        // A obj = new B(); // obj of b and refrevce ok a 
        // A obj = (A) new B(); // upcasting
        A obj = new B(); // upcasting we can wirte like this also
        obj.show1();

        // down casting 
        B obj1 = (B) obj ;
        obj1.show2();
    }
}
