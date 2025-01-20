package Ex_010_do_while_loop;
import java.util.Scanner;

public class Print_a_series_of_numbers_until_the_user_enters_negative_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter -1 to stop the loop");
            num = obj.nextInt();

        }while(num!=-1);
    }
}
