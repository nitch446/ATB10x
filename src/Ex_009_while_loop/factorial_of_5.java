package Ex_009_while_loop;

public class factorial_of_5 {
    public static void main(String[] args) {
        int num = 5;
        int i = num-1;
        while(i>=1)
        {
            num*=i;
            i--;
        }
        System.out.println("Factorial of 5 is: "+num);
    }
}
