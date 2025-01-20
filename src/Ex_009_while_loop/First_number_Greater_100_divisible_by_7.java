package Ex_009_while_loop;

public class First_number_Greater_100_divisible_by_7 {
    public static void main(String[] args) {
        int num=100;
        while(num%7!=0)
        {
            num++;
        }
        System.out.println("The number divisible by 7 is: "+num);
    }
}
