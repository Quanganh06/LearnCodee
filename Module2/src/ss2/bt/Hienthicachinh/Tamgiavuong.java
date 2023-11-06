package ss2.bt.Hienthicachinh;

import java.util.Scanner;

public class Tamgiavuong {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so dong muon hien: ");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
