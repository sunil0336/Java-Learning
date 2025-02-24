//  we can't make this A class as static
class A {
    
    int age;

    public void show(){
        System.out.println("In show ");
    }


    // this is inner class
    class B{
        public void xyz(){
            System.out.println("Class b");
        }
    }

    static class C{
        public void c(){
            System.out.println("this is static classd");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();


        // here B belongs to A  then first create obj of A then from that obj create inner class object
        A.B obj1 = obj.new B();
        obj1.xyz(); 


        // here for static class this will work , not work for non static class 
        A.C obj2 = new A.C();
        obj2.c();
        
    }
}
