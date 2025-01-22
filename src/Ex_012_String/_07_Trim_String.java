package Ex_012_String;

public class _07_Trim_String {
    public static void main(String[] args) {

        // Trims tabs, newline, space around the string
        // Example 1: Removing leading and trailing spaces
        String str = "\t    Hello world    \n";
        System.out.println("Before Trim: "+str);
        System.out.println("After Trim: "+str.trim());

        System.out.println();

        // Example 2: Comparing strings with and without trim()
        String str1 = "   Java   ";
        String str2 = "java";
        System.out.println("Is String Equal: "+str1.trim().toLowerCase().equals(str2));
    }
}
