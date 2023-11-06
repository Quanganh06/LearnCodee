package ss3.bt;

import java.util.Scanner;

public class Themmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 9, 11, 34, 21};
        System.out.println("nhap vi tri can chen: ");
        int index = sc.nextInt();
        System.out.println("nhap gia tri can chen: ");
        int loc = sc.nextInt();
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = loc;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + loc + " là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}