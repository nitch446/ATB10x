package Ex_022_Exception_Handling;

public class _02_Multiple_Catch_Block {
    public static void main(String[] args) {
        try{
                String str = null;
                System.out.println(str.length());  // Causes NullPointerException
        } catch (NullPointerException e){
            System.out.println("NullPointerException Caught!!");
        } catch (Exception e){
            System.out.println("Generic Exception Caught!!");
        }
    }
}
