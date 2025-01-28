package Ex_023_Generics;

// This is the example where we actually required the Generics.
// Instead of separate methods for addition and String Concatenation we can create Generic Method.

public class _01_Generics_Basics {
    public static void main(String[] args) {
        System.out.println(Temp_add(2,4));
        System.out.println(Temp_String("Nitin", "Chauhan"));
    }

    public static Integer Temp_add(int a, int b)
    {
        return a+b;
    }

    public static String Temp_String(String a, String b)
    {
        return a+b;
    }
}
