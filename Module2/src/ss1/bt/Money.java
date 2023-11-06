package ss1.bt;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien can doi: ");
        int tien=sc.nextInt();
        int tong=tien*24000;
        System.out.println("so tien la: "+tong);
    }
}
