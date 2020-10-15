import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First name  : ");
        String first = in.nextLine().toUpperCase();
        System.out.print("Middle name : ");
        String middle = in.nextLine().toUpperCase();
        System.out.print("Last name   : ");
        String last = in.nextLine().toUpperCase();

        System.out.printf("\n%s%s%s.\n", first.charAt(0), middle.charAt(0), last.charAt(0));
        in.close();
    }
}
