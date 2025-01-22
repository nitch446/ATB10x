package Ex_014_Oops_Concept_Classes_and_Objects;

class Student{
    String name;
    int RollNo;

    void StudentInfo()
    {
        System.out.println("Name: "+name+"\nRollNo: "+RollNo);
    }
}

public class Classes_And_Objects {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name="Nitin";
        obj.RollNo=23;
        obj.StudentInfo();
    }
}
