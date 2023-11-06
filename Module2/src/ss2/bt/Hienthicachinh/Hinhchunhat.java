package ss2.bt.Hienthicachinh;

import java.util.Scanner;

public class Hinhchunhat {

    public static void main(String[] args) {
        int height;
        int width;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap height cua hinh: ");
        height = scanner.nextInt();
        System.out.println("Nhap width cua hinh: ");
        width = scanner.nextInt();
        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("");
      }
    }
}
