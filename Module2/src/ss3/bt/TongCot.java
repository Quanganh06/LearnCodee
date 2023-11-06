package ss3.bt;

import java.util.Scanner;

public class TongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int r = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap so cot: ");
        int c = scanner.nextInt();
        scanner.nextLine();
        double[][] m = new double[r][c];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Nhập phần tử của hàng %d, cột %d: ", i, j);
                m[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập chỉ số của cột: ");
        int column = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < r; i++) {
            sum += m[i][column];
        }

        System.out.println("Tổng các phần tử của cột " + column + " là: " + sum);

        scanner.close();
    }
}
