package Ex_007_switchStatement;

public class switchstatement {
    public static void main(String[] args) {
        int a = 3;
        switch(a)
        {
            case 1:
                System.out.println("Hello 1");
            break;
            case 2:
                System.out.println("Hello 2");
                break;
            case 3:
                System.out.println("Hello 3");
                break;
            case 4:
                System.out.println("Hello 4");
                break;
            default :
                System.out.println("Please Enter correct value!!!");
        }
    }
}
