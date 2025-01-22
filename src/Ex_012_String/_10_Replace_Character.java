package Ex_012_String;

import java.sql.SQLOutput;

public class _10_Replace_Character {
    public static void main(String[] args) {
        String str = "Hello Java jordan";
        System.out.println("Replace 'J with 'k': "+str.replace('J','k'));

        System.out.println("Replace Jordan with Nitin: "+str.replace("jordan","Nitin"));
    }
}
