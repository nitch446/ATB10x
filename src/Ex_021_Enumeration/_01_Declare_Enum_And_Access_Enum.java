package Ex_021_Enumeration;

// Enum is a collection or  set of named constant values.
// Enum Constants are public, static, final
// Enum can have fields, methods, constructors
// Enum constructors are private implicitly
// Enum can have one or more interfaces but cannot extend a class
// Enum cannot extend a class
// Enum can have abstract method
// Enum Constants are ordered, starting from 0
// Use the ordinal() method to get the ordinal value
// Enum provides static method values() to get an array of all constants
// Enum constants are compared using ==
// Enums can be used in switch statement
// Enum Cannot Have protected or public Constructors


enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class _01_Declare_Enum_And_Access_Enum {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println("Today: "+day);
    }
}
