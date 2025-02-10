final class A{
    public void show(){
        System.out.println("hello this is class a");
    }
}

// cannot inherit from final A
class B{

    // here final will stop method overriding 
    public final void show(){
        System.out.println("In b class show");
    }
}
class C extends B{
    // we cannot override show method here bz in class b final keyword is used 

    // public void show(){
    //     System.out.println("this is class b");
    // }
}

public class Finalkeyword {
    public static void main(String[] args) {
        final int a = 10;
        // a = 15; The final local variable a cannot be assigned.
        System.out.println(a);

        C obj = new C();
        obj.show();
    }
}
