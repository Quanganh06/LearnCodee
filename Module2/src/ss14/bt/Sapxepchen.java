package ss14.bt;

import java.util.Arrays;

public class Sapxepchen {
    public static void main(String[] args) {
        int[] arr = {5, 11, 2, 8, 21,1};
        System.out.println("Mang ban dau" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Sau buoc " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }
}


