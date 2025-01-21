package Ex_013_Array;

public class _07_CopyingArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = new int[5];
        System.arraycopy(array,1,copy,0,2);
        System.out.println(copy[0]);
        System.out.println(copy[1]);
    }
}
