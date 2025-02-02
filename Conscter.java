class Human{
    private int age;
    private String name;

// this is constructor with default values 
    public Human(){
        age=20;
        name = "sunil";
        System.out.println("in constuctor");
    }
    public Human(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println("in constuctor with parameters");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Conscter {
    public static void main(String[] args) {
        // System.out.println("hello");
        Human obj = new Human();
        Human obj1 = new Human(23,"rathod");
        obj.setAge(22);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());
    }
}