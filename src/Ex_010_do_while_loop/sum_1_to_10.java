package Ex_010_do_while_loop;

public class sum_1_to_10 {
    public static void main(String[] args) {
        int i=1, sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=10);

        System.out.println("Sum of 1 to 10 is: "+sum);
    }
}
