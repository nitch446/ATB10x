package Ex_004_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {

        /*
          # Type Casting
           Widening (Automatically done) -> 1. Implicit (Automatically done by jvm)
                                            2. Explicit
        */

        byte a = 10;
        int b = a;
        System.out.println(b);  // Output -> 10

        /*                                 -> No data loss occurs
           Narrowing (Explicitly done) -> 1. Explicit
                                       -> Data Loss occursif the value exceeds the range of the target type.
        */

        float k = 9.97f;
        int p = (int)k;
        System.out.println(p);  // Output -> 9

        long phone_num = 8830805778l;
        short x = (short)phone_num;
        System.out.println(x);


    }
}
