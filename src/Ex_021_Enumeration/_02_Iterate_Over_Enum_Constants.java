package Ex_021_Enumeration;

enum Days021{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

public class _02_Iterate_Over_Enum_Constants {
    public static void main(String[] args) {
        for(Days021 day : Days021.values())
        {
            System.out.println(day);
        }
    }
}
