package Ex_016_Oops_Concept_Abstraction_Abstract;

// Abstraction meaning hiding the implementation and showing only essential.
// It can have both abstract methods (methods without a body) and concrete methods (methods with a body).
// use abstract keyword to declare an abstract class and its methods.
// Abstract classes can have constructor, fields, and methods with implementation
// It is used when classes share some common behaviour
// And some details are left to the derived classes

abstract class Shape{

   String color;

    // abstract method (method without body)
    abstract void draw();

    // concrete method (method with body)
    void setcolor(String color)
    {
        this.color = color;
    }

    void getcolor()
    {
        System.out.println("Color: "+color);
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Draw Circle");
    }
}


public class Abstraction_using_abstract {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.setcolor("Red");
        obj.getcolor();
        obj.draw();
    }
}
