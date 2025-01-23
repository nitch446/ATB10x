package Ex_019_Super_Keyword;

class person02 {
    void person02()
    {
        System.out.println("Hello this parent method");
    }
}

class nitin02 extends person02 {
    void nitin02()
    {
        System.out.println("Hello this child method");
    }

    void callParentMethod()
    {
        super.person02();
    }
}
public class _02_Call_Parent_Class_Method {
    public static void main(String[] args) {
        nitin02 obj = new nitin02();
        obj.nitin02();
        obj.callParentMethod();
    }
}
