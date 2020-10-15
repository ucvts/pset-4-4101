import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Centimeters : ");
        int centimeters = in.nextInt();

        int kilometers = centimeters / 100000;
        centimeters = centimeters % 100000;
        int meters = centimeters / 100;
        centimeters = centimeters % 100;

        System.out.println("\nKilometers  : " + kilometers);
        System.out.println("Meters      : " + meters);
        System.out.println("Centimeters : " + centimeters);
        in.close();
    }
}
