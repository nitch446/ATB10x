package Ex_019_Super_Keyword;

// Super Keyword refers to immediate parent class of the current class.
// Commonly used in inheritance
// Used to access parent class constructor, methods and variables

class person{
    person()
    {
        System.out.println("Hello I'm Parent class");
    }
}

class nitin extends person {
    nitin()
    {
        super(); //calls parent class constructor
        System.out.println("Hello I'm Child");
    }
}

public class _01_Access_Parent_Class_Consructor {
    public static void main(String[] args) {
        nitin obj = new nitin();
    }
}
