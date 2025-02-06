
class A{
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in b show");
    }
}
class C extends B{
    public void show(){
        System.out.println("in c show");
    }
}
class D{
    public void show(){
        System.out.println("in d show");
    }
}


public class dynamicMethodDispatch {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // obj = new D();
        // obj.show();
// it will give error bz obj has rederence of a it will only work in inheritance , in d class i have not extended any a,b,c class so it will not work / only you have child object of A class
        


        // it is run time polymorphism
    }
}
