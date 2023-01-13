import org.xml.sax.SAXException;

public class strings {
    public static void main(String[] args) 
    {

        {
            char chars[] = {'2', '2', '6', '7'};
        String s = new String(chars, 2, 2);
        System.out.println(s);
        String snew = new String(s);
        System.out.println(snew);
        String word = "Kumar";
        String word2 = " Abhishek";
        word = word.concat(word2);
        System.out.println(word);
    }
    {    
        char str[] = new char[8];
        String sup = "OmNamahShivay";
        sup.getChars(2, 7, str, 1);
        for(int i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
    {
        String gh = "Computer";
        byte chr[] = gh.getBytes(); // use it in a environment where 16-bit Unicode characters is not supported. Example - Internet protocols and text file formats use 8-bit ASCII for all text.
        
        System.out.println(chr);
        for(int i = 0; i<chr.length; i++)
        {
            System.out.println(chr[i]);
        }
    }

    // String Funtions equals() vs == 

    String st = new String("Hello");
    String nst = new String(st);
    System.out.println("st = " + st);
    System.out.println("nst = " + nst);
    System.out.println("st.equals(nst) -> "+ st.equals(nst));
    System.out.println("st == nst -> " + st == nst);
    }
}
