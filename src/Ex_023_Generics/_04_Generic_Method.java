package Ex_023_Generics;

public class _04_Generic_Method {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"nitin", "Chauhan"};
        printArray(intArray);
        printArray(strArray);

    }

    public static <T> void printArray(T[] array){
        for(T Item:array)
        {
            System.out.print(Item+"  ");
        }
        System.out.println();
    }
}
