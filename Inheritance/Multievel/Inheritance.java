public class Inheritance {
    public static void main(String[] args) {
        
        MoreAdvCalc obj1 = new MoreAdvCalc();

        int p = obj1.add(1,2);
        int q = obj1.sub(5, 3);
        int r = obj1.mult(2, 3);
        int s = obj1.div(2, 3);
        int t = obj1.addd(2, 6);
        // double t = obj1.powerr(2, 6);

        System.out.println(p+ " " + q + " " + r + " " + s + " "+ t);
    }
}

// here we are inheriting Calc -> AdvCalc -> MoreAdvCalc