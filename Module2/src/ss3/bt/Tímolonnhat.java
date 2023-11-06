package ss3.bt;

import java.util.Scanner;

public class Tímolonnhat {
    public static void main(String[] args) {
        int n,i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        double max=A[0];
        System.out.println("Cac phan tu trong mang la: "+A);
        for (double num: A) {
            if(max < num)
                max = num;
        }
        System.out.printf("\nSố lớn nhất trong mảng là: " +max);
    }
}
