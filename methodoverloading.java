class cal{

// This is method overloading 
// here 3 methods with same name only the diffrence is no. of parameters . 
// it will automatically detect which method have to use ,i.g if i have 3 marameters then it will run add method with 3 paramters etc.


    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public double add(double a, int b){
        return a+b;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        cal c = new cal();

        System.out.println(c.add(5,5));
    }
}
