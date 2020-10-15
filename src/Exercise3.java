import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length   : ");
        double length = in.nextDouble();
        System.out.print("Width    : ");
        double width = in.nextDouble();
        System.out.print("Diameter : ");
        double diameter = in.nextDouble();

        double board = length * width;
        double circle = Math.PI * Math.pow((diameter / 2), 2);
        double area = board - circle;

        System.out.printf("\nSurface area : %,.2f\n", area);
        in.close();
    }
}
