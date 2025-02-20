public class wrapperclass {
    public static void main(String[] args) {
        
        int num = 7;

        // boxing , here we are stoaring a premitive values in obj
        // Integer num1 = new Integer(num);  
        Integer num1 = num;  // autoboxing


        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto-unboxing 

        System.out.println(num2);

        String str = "5";
        int num3 = Integer.parseInt(str); // converting string into the integer
        System.out.println(num3*2);

    }
}
