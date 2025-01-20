package Ex_010_do_while_loop;
import java.util.Scanner;

public class Display_a_menu_repeatedly_until_the_user_selects_an_option_to_exit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.println("Select Option");
            choice = obj.nextInt();
        }while(choice!=3);
    }
}
