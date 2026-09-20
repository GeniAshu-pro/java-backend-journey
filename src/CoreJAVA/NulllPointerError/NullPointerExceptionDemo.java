package NulllPointerError;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String name = "Java";
        if(name != null){
            System.out.println(name);
        }
        else{
            System.out.println("No name value present");
        }
    }

}
