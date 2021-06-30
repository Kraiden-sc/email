import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
public class phone {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("phonenumb.csv"));
        System.setOut(out);
        for (int i = 0; i < 50000; i++) { //задаем необходимое количество emails
            System.out.println("1878"+ getString0());
            //System.out.println("+" + getString0());
        }}
    public static String getString0() {
        String chars = "123456789";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 7) { //длина номера
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str = size.toString();
        return Str;
    }
    public static String getString1() {
        String chars = "0123456789";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 10) { //длина номера
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str1 = size.toString();
        return Str1;
    }
    public static String getString2() {
        String chars = "123456789";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 4) { //длина номера
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str2 = size.toString();
        return Str2;
    }


}