package ss13.bt;

import java.util.Arrays;
import java.util.Scanner;

public class Sxdequy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap phan tu mang: ");
//        int n=scanner.nextInt();
//        int [] array=new int[n];
//        System.out.println("Nhap vao phan tu mang: ");
//        for (int i=0;i<n;i++){
//            System.out.println(i);
//            array[i]=scanner.nextInt();
//        }

        int[] array = {5, 2, 10, 8, 3, 1};
        Arrays.sort(array);
        System.out.println("Mang ban dau la: "+Arrays.toString(array));
        System.out.println("Nhap vao so can tim : ");
        int value = scanner.nextInt();

        int index = binarySearch(array, 0, array.length - 1, value);
        if (index != -1) {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Giá trị " + value + " không được tìm thấy trong mảng.");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}

