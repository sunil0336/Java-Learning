public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();

        int p = obj1.add(1,2);
        int q = obj1.sub(5, 3);
        int r = obj1.mult(2, 3);
        int s = obj1.div(2, 3);

        System.out.println(p+ " " + q + " " + r + " " + s);
    }
}
