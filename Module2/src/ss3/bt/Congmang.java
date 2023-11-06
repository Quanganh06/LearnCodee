package ss3.bt;

import java.util.Arrays;

public class Congmang {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {3, 5, 7};
        int length = arr1.length + arr2.length;
        int[] Result = new int[length];
        int pos = 0;
        for (int num : arr1) {
            Result[pos] = num;
            pos++;
        }
        for (int num : arr2) {
            Result[pos] = num;
            pos++;
        }
        System.out.println(Arrays.toString(Result));
    }
}

