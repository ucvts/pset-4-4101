import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side : ");
        double side = in.nextDouble();

        double area = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
        double hexagonPerimeter = side * 6;

        System.out.printf("\nArea      : %,.2f\n", area);
        System.out.printf("Perimeter : %,.2f\n", hexagonPerimeter);
        in.close();
    }
}
