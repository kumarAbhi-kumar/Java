import org.xml.sax.SAXException;

public class strings {
    public static void main(String[] args) {
        
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
}
