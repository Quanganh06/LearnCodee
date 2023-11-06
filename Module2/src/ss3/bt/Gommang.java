package ss3.bt;

import java.util.Arrays;

public class Gommang {
    public static void main(String[] args){
        int[] src1 = {1,4,11,21};
        int[] src2 = {17,2,6,9};
        int[] dst = new int[src1.length + src2.length];

        System.arraycopy(src1, 0, dst, 0, src1.length);
        System.arraycopy(src2, 0, dst, src1.length, src2.length);

        System.out.println(Arrays.toString(dst));
    }
}