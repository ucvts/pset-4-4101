import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your favorite city? ");
        String city = in.nextLine();

        System.out.println("\nText   : " + city);
        System.out.println("Length : " + city.length());
        System.out.println("Upper  : " + city.toUpperCase());
        System.out.println("Lower  : " + city.toLowerCase());
        in.close();
    }
}
