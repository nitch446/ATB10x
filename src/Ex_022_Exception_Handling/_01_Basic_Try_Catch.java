package Ex_022_Exception_Handling;

public class _01_Basic_Try_Catch {
    public static void main(String[] args) {
        try{
            int result = 10/0;    // Causes ArithmeticException
        } catch (RuntimeException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}
