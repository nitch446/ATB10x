package Ex_020_Static_Keyword;

class className{
    static void displayStaticMessage()
    {
        System.out.println("Hello I'm Static Method and can called be using class name");
    }
}

public class _02_Static_Method {
    public static void main(String[] args) {
        className.displayStaticMessage();
        className obj = new className();
        obj.displayStaticMessage();
    }
}
