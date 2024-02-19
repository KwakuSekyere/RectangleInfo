import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height, area, perimeter, diagonal;

        System.out.println("Enter the width of the rectangle:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid width:");
            scanner.next(); // c
        }
        width = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid height:");
            scanner.next(); //
        }
        height = scanner.nextDouble();

        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(width * width + height * height);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
