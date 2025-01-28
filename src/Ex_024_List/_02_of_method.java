package Ex_024_List;
import java.util.Collection.*;
import java.util.Iterator;
import java.util.List;
// of() is static
// belongs list interface
// max 10 arguments it can take

public class _02_of_method {
    public static void main(String[] args) {
        List fruits = List.of("Apple", "Banana"); // add() not supported in this List interface

        // for loop to access list
        for(int i=0; i<fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }
        System.out.println("------------");
        // for each loop
        for(Object o : fruits)
        {
            System.out.println(o);
        }
        System.out.println("------------");
        // Iterator - Anchor -> go one by one forward
        // hasNext() ->  true -> if we have next element
        // Next -> Gives next element
        Iterator itr = fruits.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
