
class Laptop{

    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
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
