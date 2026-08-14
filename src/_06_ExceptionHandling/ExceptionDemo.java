package _06_ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int i = 3;
        try {
            int value = a[i];
            System.out.println("Value at Index " + i + ": ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message: "+e.getMessage());
            System.out.println("Plz Enter valid Index");
        }
    }
}
