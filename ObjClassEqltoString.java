
class Laptop{

    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }
    public boolean equals(Laptop that){
        // if(this.model.equals(that.model) && this.price == that.price)
        //     return true;
        // else
        //     return false;

        return this.model.equals(that.model) && this.price == that.price;
    }
}


public class ObjClassEqltoString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "acer swift go 14";
        obj.price = 50000;

        Laptop obj1 = new Laptop();
        obj1.model = "acer swift go 14";
        obj1.price = 50000;

        boolean res = obj.equals(obj1);

        System.out.println(res);
    }
    
}
