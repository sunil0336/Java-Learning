class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int "+n);
    }
}

class B extends A{
    public B(){
        this(5);
        System.out.println("in B");
    }
    public B(int n){
        // this(); // in b also called 
        // super(n); // without this in a will called
        System.out.println("in B int "+n);
    }
}

public class SuperThis {
    public static void main(String[] args) {
       B obj = new B(); 
    }
}
