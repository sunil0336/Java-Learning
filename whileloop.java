public class whileloop {
    public static void main(String[] args) {
        int i = 1;

        while(i<=5){
            System.out.println("hi "+ i);
            int j=1;
            //nested loop that will run after every hi 2 times 
            while(j<=2){
                System.out.println("Hey " + j);
                j++;
            }
            i++;
        }
        // execute when while loop is exited
        System.out.println("Bye "+ i);
    }
}
