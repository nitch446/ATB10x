package ex_011_Functions;

public class _03_Function_With_Parameter_And_Return_Value {
    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        int result = sum(2,4);
        System.out.println("Sum is: "+result);
    }
}
