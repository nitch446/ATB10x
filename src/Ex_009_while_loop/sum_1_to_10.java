package Ex_009_while_loop;

public class sum_1_to_10 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while(i<=10)
        {
            sum += i;
            i++;
        }
        System.out.println("Total is: "+sum);
    }
}
