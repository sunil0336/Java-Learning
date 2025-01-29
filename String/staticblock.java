class Mobile{
    String brand;
    int price;
    static String name;

public Mobile(){
    brand = "";
    price = 200;
    System.out.println("In constructor");
}

static {
    name = "Phone";
    System.out.println("In static");
}

public void show(){
    System.out.println(brand + " : " + price + " : " + name);
}

}

public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile m = new Mobile();
        // m.brand = "Redmi";
        // m.price = 15000;
        // Mobile.name = "Andoird Phone";

        // m.show();

// it will load your class , the system class loader is used
        Class.forName("Mobile");

    }
    
}


// class load only ones , in jvm all the class are loaded 
// every time when class will load then it will call static block first then obj is created 

// normaly we don't use it 