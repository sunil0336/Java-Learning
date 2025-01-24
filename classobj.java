class calculator{
    
    public int add(int a, int b){
        return (a+b);
    }
    public int sub(int a, int b){
        return (a-b);
    }
    public int mult(int a, int b){
        return (a*b);
    }
}



public class classobj {
    public static void main(String [] args){
        int a = 5;
        int b=4;
        
        calculator calc = new calculator();

        System.out.println("The Sum is "+ calc.add(a,b));
        System.out.println("The Subtraction is "+ calc.sub(a,b));
        System.out.println("The Multiplication is "+ calc.mult(a,b));
    }
}