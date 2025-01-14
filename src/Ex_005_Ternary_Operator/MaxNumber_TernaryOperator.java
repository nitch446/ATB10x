package Ex_005_Ternary_Operator;

public class MaxNumber_TernaryOperator {
    public static void main(String[] args) {
        int a= 10, b=20, c=30;

        int res1 = a>b?a:b;
        System.out.println("Res1= "+res1);

        int res2 = a>b?a:b>c?b:c;
        System.out.println("Res2= "+res2);
    }
}
