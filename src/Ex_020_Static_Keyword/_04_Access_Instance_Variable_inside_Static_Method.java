package Ex_020_Static_Keyword;

class Example{
    String name = "nitin chauhan";

    static void DisplayName()
    {
        Example obj = new Example();
        System.out.println("Name: "+obj.name);
    }
}
public class _04_Access_Instance_Variable_inside_Static_Method {
    public static void main(String[] args) {
    Example.DisplayName();
    }
}
