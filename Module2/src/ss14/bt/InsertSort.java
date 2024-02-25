package ss14.bt;


public class InsertSort {
    static double[] list = {1, 2, 5, 3, 11, 4};

    public static void InsertSort(double[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = (int) list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        InsertSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}



