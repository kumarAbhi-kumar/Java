import java.io.IOException;
import java.util.*;
public class Sets {
    public static void main(String []args) throws IOException
    {
        Set<String> set = new HashSet<String>();
        set.add("Ram");
        set.add("Sita");
        set.add("Krishna");
        set.add("Radha");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext())
        {
            String text = itr.next();
            System.out.println(text);
        }
    }
}
