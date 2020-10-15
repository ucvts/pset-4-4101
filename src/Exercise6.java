import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length : ");
        double length = in.nextDouble();
        System.out.print("Width  : ");
        double width = in.nextDouble();

        double area = length * width;
        double perimeter = length * 2 + width * 2;
        double diagonal = Math.hypot(length, width);

        System.out.printf("\nArea      : %,.2f\n", area);
        System.out.printf("Perimeter : %,.2f\n", perimeter);
        System.out.printf("Diagonal  : %,.2f\n", diagonal);
        in.close();
    }
}
