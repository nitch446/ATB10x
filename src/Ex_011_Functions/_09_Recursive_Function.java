package Ex_011_Functions;

public class _09_Recursive_Function {

    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println("Factorial of 5 is: "+result);
    }
}
