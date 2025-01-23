package Ex_021_Enumeration;

class pizza{

    enum Size{
        SMALL, MEDIUM, LARGE;
    }

    private Size size;

    pizza(Size size)
    {
        this.size = size;
    }
    void displaySize()
    {
        System.out.println("Pizza size is: "+size);
    }
}

public class _06_Enum_in_Class {
    public static void main(String[] args) {
        pizza obj = new pizza(pizza.Size.LARGE);
        obj.displaySize();
    }
}
