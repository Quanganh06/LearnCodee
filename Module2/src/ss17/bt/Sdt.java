package ss17.bt;

import java.util.Scanner;

public class Sdt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFlag;
        String a = " ";
        do {
            System.out.print("moi ban nhap SDT: ");
            a = scanner.nextLine();
            isFlag = a.matches("^\\+84\\-\\d{10}$");
            if (!isFlag) {
                System.err.println("Sdt không hợp lệ. Vui lòng nhập lại!");
            }
        } while (!isFlag);

        System.out.println("Sdt hợp lệ: " + isFlag);
    }

}
