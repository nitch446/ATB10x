package Ex_023_Generics;

public class _02_Actuall_Generics_Implementation {
    public static void main(String[] args) {
        temp_add_Concat(2,4);
        temp_add_Concat("nitin","chauhan");
    }

    public static <T> T temp_add_Concat(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
