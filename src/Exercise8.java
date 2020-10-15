import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Text : ");
        String text = in.nextLine().toUpperCase();

        String left = text.substring(0, text.length() / 2);
        String right = text.substring(text.length() / 2);

        System.out.println("\n" + right + left + ".");
        in.close();
    }
}
