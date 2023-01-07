import java.util.*;
public class HashSet {
    public static void main(String []args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Ram");
        set.add("Sita");
        set.add("Krishna");
        set.add("Radha");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
