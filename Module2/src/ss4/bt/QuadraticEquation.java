package ss4.bt;

import sun.awt.util.IdentityArrayList;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() >= 0) {
            double x1 = (-b + Math.sqrt(equation.getDiscriminant())) / (2 * a);
            double x2 = (-b - Math.sqrt(equation.getDiscriminant())) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

