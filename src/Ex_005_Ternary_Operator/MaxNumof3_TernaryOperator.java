package Ex_005_Ternary_Operator;

public class MaxNumof3_TernaryOperator {
    public static void main(String[] args)
    {
        int a = 30, b= 10, c=70;
        int max_result = (a>=b && a>=c)?a:(b>=c?b:c);
        System.out.printf("Max Value: %d",max_result);
    }
}
