import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
public class email {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("output.csv"));
        System.setOut(out);
        for (int i = 0; i < 1000; i++) { //задаем необходимое количество emails
            System.out.println(getString()+"@" + getDomain());
        }
    }
    public static String getString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 10) { //длина email
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str = size.toString();
        return Str;
    }
    public static String getDomain() {
        Object[] array = {"hotmail.com", "sky.com", "live.co.uk", "search.co.uk", "gmail.com"};
        Random rnd = new Random();
        Object domain = array[rnd.nextInt(array.length)];
        String Str1 = domain.toString();
        return Str1;
    }
}