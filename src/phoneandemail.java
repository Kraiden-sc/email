import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
public class phoneandemail {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("output.csv"));
        System.setOut(out);
        for (int i = 0; i < 20; i++) { //задаем необходимое количество emails
            System.out.println(getString()+"@" + getDomain() + "\t" + getString0() + "-" + getString1() + "-" + getString2());
// System.out.printf("%-30.30s %-30.30s\n", getString()+"@" + getDomain() + "" + getString0() + "-" + getString1() + "-" + getString2());
// new Columns()
// .addLine("One", "Two", "Three", "Four")
// .addLine("1", "2", "3", "4")
// .print()
//;
        }}
    public static String getString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 15) { //длина email
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str = size.toString();
        return Str;
    }
    public static String getDomain() {
        Object[] array = {"mail.ru", "list.ru", "rambler.ru", "yandex.ru", "gmail.com"};
        Random rnd = new Random();
        Object domain = array[rnd.nextInt(array.length)];
        String Str1 = domain.toString();
        return Str1;
    }
    public static String getString0() {
        String chars = "123456789";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 3) { //длина номера
            int index = (int) (rnd.nextFloat() * chars.length());
            size.append(chars.charAt(index));
        }
        String Str = size.toString();
        return Str;
    }
    public static String getString1() {
        String chars = "123456789";
        StringBuilder size = new StringBuilder();
        Random rnd = new Random();
        while (size.length() < 3) { //длина номера
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