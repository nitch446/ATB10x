package Ex_020_Static_Keyword;


class Demo{
    static{
        System.out.println("This is static block. Executed First!!!");
    }
    Demo()
    {
        System.out.println("This is Constructor. Executed after static block!!!");
    }
}
public class _03_Static_Block {
    public static void main(String[] args) {
        new Demo();
    }
}
