package ex_011_Functions;

public class _08_Function_With_Default_Parameters {
    public static void greet(String name, String greeting)
    {
        System.out.println(name+": "+greeting);
    }
    public static void greet(String name)
    {
        greet(name,"Hello");
    }

    public static void main(String[] args) {
        greet("Nitin");
        greet("Rahul","Hello");
    }
}
