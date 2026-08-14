package _06_ExceptionHandling;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int size;
        size = a.length;
        int index = 7;
        try {
            if (index >= size || index <0) {
                throw new ArrayIndexOutOfBoundsException("Bhai index size se bhi bada hai");
            }
        }  catch (ArithmeticException e) {
            System.out.println("Arithmetic Error  : " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error  : " + e.getMessage());
        } finally {
            // execute hoga har baar
            // mostly use for resource management like file system , database etc
            System.out.println("Finally block !!! ");
        }


    }
}
