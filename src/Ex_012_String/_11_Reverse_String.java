package Ex_012_String;

// StringBuilder is a class in Java used to create mutable (modifiable) strings.

public class _11_Reverse_String {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: "+reversed);
    }
}
