public class switchprac {
    public static void main(String[] args) {
        String day = "monday";

    switch(day){
        case "saturday","sunday" -> System.out.println("wake up at 8 am");

        case "monday" -> System.out.println("Wakeup at 7 am");

        default-> System.out.println("wakeup at 6 am");
    }
    }
}
