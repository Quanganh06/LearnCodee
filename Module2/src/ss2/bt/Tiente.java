package ss2.bt;

import java.util.Scanner;

public class Tiente {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao 1 so tien can quy doi sang VND: ");
        int n=sc.nextInt();
        System.out.println("So tien sau khi quy doi tu USD sang VND la : "+n*23000);
    }
}
