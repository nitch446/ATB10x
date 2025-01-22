package Ex_015_Oops_Concept_Inheritance;

// Inheritance is a mechanism where child class or sub-classes inherits the properties
// and behaviour of the parent or super class.

class Animal{
    void eat()
    {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog obj1_Dog = new Dog();
        obj1_Dog.eat();
        obj1_Dog.bark();
    }
}
