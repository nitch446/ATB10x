package Ex_011_Functions;

public class _04_Function_With_Multiple_Parameters_And_Return_Value {

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }


    public static void main(String[] args) {
        int result = multiply(2,3,4);
        System.out.println("Multiplied Result is: "+result);
    }
}
