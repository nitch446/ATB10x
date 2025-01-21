package Ex_011_Functions;

public class _07_Instance_Function {
    public void displayMessage()
    {
        System.out.println("Hello Nitin");
    }

    public static void main(String[] args) {

        _07_Instance_Function obj = new _07_Instance_Function(); // Creating an object of _07_Instance_Function
        obj.displayMessage();  // Calling the instance method
    }
}
