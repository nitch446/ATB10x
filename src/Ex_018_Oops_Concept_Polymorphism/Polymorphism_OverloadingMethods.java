package Ex_018_Oops_Concept_Polymorphism;

// Overloading or Compile time polymorphism
// Methods with same but different types or number of argument or signature

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

}

public class Polymorphism_OverloadingMethods {
    public static void main(String[] args) {
        Calculator clc = new Calculator();
        System.out.println("Sum of int types: "+clc.add(2,4));
        System.out.println("sum of float type: "+clc.add(3.1f,4.1f));

    }
}
