package Ex_008_for_Loops;

public class nested_for_loop {
    public static void main(String[] args) {

        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
