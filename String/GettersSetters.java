// this keyword = 
class Human{
    private int age;
    private String name;

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

public class GettersSetters {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Sunillllll");

        System.out.println(obj.getAge()+" "+ obj.getName());
    }
}


// we can use any variable name insted of getAge but is is easy to understand 

// ide shortcut = rightclick - source action - getters and setters ---- it will automatically create getters and setters 
