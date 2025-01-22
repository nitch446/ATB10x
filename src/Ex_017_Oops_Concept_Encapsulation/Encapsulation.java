package Ex_017_Oops_Concept_Encapsulation;

// Encapsulation is bundling up of data(variable) and Methods(Functions) that operates on the data
// into a single unit.

class Employee{
    private String name;
    private int age;

    // Set name
    public void name(String name){
        this.name = name;
    }

    // Set Age
    public void age(int age){
        if(age>0)
        {
           this.age=age;
        }
        else
        {
            System.out.println("Age must be Positive!");
        }
    }

    // get name
    public String name()
    {
        return name;
    }

    // get age
    public int age()
    {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name("Nitin");
        emp.age(23);

        System.out.println("Name: "+emp.name());
        System.out.println("Age: "+emp.age());
    }
}
