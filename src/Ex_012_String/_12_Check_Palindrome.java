package Ex_012_String;

public class _12_Check_Palindrome {
    public static void main(String[] args) {
        String str = "nitin";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Is Palindrome: "+str.equals(reverse));
    }
}
