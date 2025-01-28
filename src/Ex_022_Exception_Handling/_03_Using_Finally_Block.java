package Ex_022_Exception_Handling;

public class _03_Using_Finally_Block {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Error Division by zero!!!");
        } finally {
            System.out.println("This will always executed");
        }
    }
}
