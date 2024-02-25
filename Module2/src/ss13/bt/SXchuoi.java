package ss13.bt;

import java.util.Arrays;
import java.util.Scanner;

public class SXchuoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String input=sc.nextLine();
        char[] chars=input.toCharArray();
        Arrays.sort(chars);
        String sortedString=new String(chars);
        System.out.println("Chuoi con dc sap xep theo thu tu la: "+sortedString);
    }
}
