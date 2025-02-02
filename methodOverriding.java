class Calc{
    public int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    //here is same method add we can do modification in that method 
    public int add(int a, int b){
        return a+b+1;
    }
}

public class methodOverriding {
    public static void main(String[] arg){

       AdvCalc obj= new AdvCalc();
       System.out.println(obj.add(5, 5)); 

    }
}
