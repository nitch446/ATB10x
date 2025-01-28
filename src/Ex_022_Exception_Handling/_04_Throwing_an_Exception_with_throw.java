package Ex_022_Exception_Handling;

public class _04_Throwing_an_Exception_with_throw {

    public static void ValidateAge(int age){
        if(age<18)
        {
          throw new IllegalArgumentException("Age must be 18 or older");
        }
    }

    public static void main(String[] args) {
        try{
            ValidateAge(6);
        } catch (IllegalArgumentException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
