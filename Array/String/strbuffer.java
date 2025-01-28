public class strbuffer {
    public static void main(String[] args) {
    //the stringbuffer is mutable we can chnage it 
        StringBuffer sb =new StringBuffer("Sunil");
    //before changing 
    System.out.println(sb);
    
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    // append the string 
    sb.append("Rathod");
    //after changing 
        System.out.println(sb);
        
    }
}
