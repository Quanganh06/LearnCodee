package ss17.bt;

import java.util.Scanner;

    public class ValiableNameclass {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isFlag;
            String NameClass = " ";
            do {
                System.out.print("moi ban nhap ten: ");
                NameClass = scanner.nextLine();
                isFlag = NameClass.matches("^[CAP][0-9]{4}[GHIKLM]$");
                if (!isFlag) {
                    System.out.println("Tên lớp học không hợp lệ. Vui lòng nhập lại!");
                }
            } while (!isFlag);

            System.out.println("Tên lớp học hợp lệ: " + isFlag);
        }

    }


