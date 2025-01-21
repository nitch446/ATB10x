package Ex_012_String;

public class _05_Compare_Strings {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        System.out.println("Is String Equal (Case Sensitive): "+str1.equals(str2));
        System.out.println("Is String Equal (Ignore Case Sensitivity): "+str1.equalsIgnoreCase(str2));
    }
}
