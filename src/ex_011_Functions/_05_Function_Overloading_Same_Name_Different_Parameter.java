package ex_011_Functions;

public class _05_Function_Overloading_Same_Name_Different_Parameter {

    public static void personinfo(String name)
    {
        System.out.println("Name is "+name);
    }

    public static void personinfo(String name, int age)
    {
        System.out.println("Name: "+name+" age: "+age);
    }

    public static void main(String[] args) {
        personinfo("nitin");
        personinfo("rahul",34);
    }
}
