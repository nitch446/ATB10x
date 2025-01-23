package Ex_021_Enumeration;

enum Days03
{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}
public class _03_Enum_in_Switch_Statement {
    public static void main(String[] args) {
        Days03 today = Days03.Friday;

        switch(today)
        {
            case Monday, Tuesday, Wednesday, Thursday, Friday:
                System.out.println(today+" => This is working day");
                break;
            case Saturday, Sunday:
                System.out.println(today+" => This is Weekend (Holiday)");
                break;
        }
    }
}
