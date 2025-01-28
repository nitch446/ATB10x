package Ex_023_Generics;

class Box <T> {
    private T value;
    public void setvalue(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}

public class _03_Generic_Class {
    public static void main(String[] args) {
        Box<Integer> intobj = new Box<>();
        intobj.setvalue(2);
        System.out.println("Integer Value: "+intobj.getValue());

        Box<String> stringobj = new Box<>();
        stringobj.setvalue("nitin");
        System.out.println("String Value: "+stringobj.getValue());
    }
}
