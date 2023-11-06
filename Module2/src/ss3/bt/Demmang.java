package ss3.bt;

import java.util.Scanner;

public class Demmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6, 7};
        double so = arr[0];
        int count = 0;
        System.out.println("nhap vao mot so nguyen: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (so==num){
                count++;
            }
        }
        System.out.println("Số phần tử có trong mảng = " + count);
    }
}
