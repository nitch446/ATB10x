package Ex_021_Enumeration;

enum Days04{
    Monday("WorkDay"),
    Tuesday("Workday"),
    Wednesday("Workday"),
    Thurday("Workday"),
    Friday("Workday"),
    Saturday("Weekend"),
    Sunday("Weekend");

    private String type;

    Days04(String type)
    {
        this.type = type;
    }

    public String GetType()
    {
        return type;
    }
}
public class _04_Fields_And_Constructor_in_Enum {
    public static void main(String[] args) {
        for(Days04 day : Days04.values())
        {
            System.out.println(day+" is a "+day.GetType());
        }
    }
}
