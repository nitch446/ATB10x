package Ex_013_Array;

public class _01_Declare_And_Initialize_Array {
    public static void main(String[] args) {

        // int[] array;  //Array Declaration

        // Array Initialization
        int[] array = new int[5];
        array[0]=2;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;

        for(int i=0; i<5; i++)
        {
            System.out.println(array[i]);
        }


    }
}
