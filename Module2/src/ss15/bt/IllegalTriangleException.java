package ss15.bt;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class TriangleChecker {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the length of side a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the length of side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter the length of side c: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
            System.out.println("Valid triangle");
            scanner.close();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number for the side lengths.");
        }
    }

}

