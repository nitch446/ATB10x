package Ex_021_Enumeration;

// In Java, enums can contain abstract methods, and
// each enum constant can provide its own implementation of these methods.
// This approach allows for defining a set of related constants, each with distinct behaviors,
// encapsulated within a single enum type.
// By iterating over the enum constants,
// the program can apply different operations in a clean and organized manner.

enum calculator{
    add{
        public int apply(int a, int b) {
            return a + b;
        }
    },

    //Override
    sub{
        public  int apply(int a, int b){
            return a-b;
        }
    };
    // Abstract method
    public abstract int apply(int a, int b);

}

public class _07_Enum_With_Abstract_Method {
    public static void main(String[] args) {
        int x=10, y=2;
        for(calculator operation : calculator.values())
        {
            System.out.println(operation+" is: "+operation.apply(x,y));
        }
    }
}
