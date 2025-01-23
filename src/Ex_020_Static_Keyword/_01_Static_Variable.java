package Ex_020_Static_Keyword;

// Static Keyword in java used to indicate that a class members (variables, methods, blocks)
// belongs to the class, rather than an instance of the class
// Only one copy of static member is created and shared among all the objects of a class
// Static method can be directly called using className as well
// Static Block is called before the constructor as soon as object is created
// Static methods cannot access instance variables directly
// First create class object inside the static method, then call instance variable using object

class counter {
    static int count=0; // Shared among all the objects (only one copy of it is created)

    counter()
    {
       count++;
    }
    void displaycount()
    {
        System.out.println("Count is: "+count);
    }
}

public class _01_Static_Variable {
    public static void main(String[] args) {
        counter obj1 = new counter();
        counter obj2 = new counter();
        counter obj3 = new counter();
        obj1.displaycount();
    }
}
