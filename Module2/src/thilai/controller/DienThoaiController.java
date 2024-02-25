package thilai.controller;


import thilai.serivice.DienThoaiChinhHangService;
import thilai.serivice.IDienThoaiChinhHangService;

import java.util.Scanner;

public class DienThoaiController {
    private static Scanner scanner = new Scanner(System.in);
    private static IDienThoaiChinhHangService iDienThoaiChinhHangService = new DienThoaiChinhHangService();
    public static void main (String[]args){
        int chon = 0;
        boolean check;
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM---");
            System.out.println("Chọn chức năng để tiếp tục: ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            do {
                System.out.println("Nhập vào lựa chọn : ");
                check = false;
                try {
                    chon= Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    check = true;
                    e.printStackTrace();
                }catch (Exception e){
                    check = true;
                    e.printStackTrace();
                }
            }while (check);
            switch (chon){
                case 1:
                    int luachon = 0;
                    do {
                        System.out.println("---THÊM MỚI---");
                        System.out.println("1. Sản phẩm nhập khẩu");
                        System.out.println("2. Sản phẩm xuất khẩu");
                        System.out.println("3. Thoát");
                        System.out.println("Nhập vào lựa chọn : ");
                        luachon = Integer.parseInt(scanner.nextLine());
                        switch (luachon){
                            case 1:
                                iDienThoaiChinhHangService.them();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }while (luachon<1||luachon>3||luachon!=3);
                    break;
                case 2:
                    int luachon1 = 0;
                    do {
                        System.out.println("---XÓA---");
                        System.out.println("1. Sản phẩm nhập khẩu");
                        System.out.println("2. Sản phẩm xuất khẩu");
                        System.out.println("3. Thoát");
                        System.out.println("Nhập vào sự lựa chọn : ");
                        luachon1 = Integer.parseInt(scanner.nextLine());
                        switch (luachon1){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                iDienThoaiChinhHangService.xoa(id);
                                System.out.println("----------------------");
                                System.out.println("Xóa thành công" );
                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                        }
                    }while (luachon1<1||luachon1>3||luachon1!=3);
                    break;
                case 3:
                    int luachon2 = 0;
                    do {
                        System.out.println("---HIỂN THỊ DANH SÁCH---");
                        System.out.println("1. Sản phẩm nhập khẩu");
                        System.out.println("2. Sản phẩm xuất khẩu");
                        System.out.println("3. Thoát");
                        System.out.println("Nhập vào sự lựa chọn: ");
                        luachon2 = Integer.parseInt(scanner.nextLine());
                        switch (luachon2){
                            case 1:
                                iDienThoaiChinhHangService.danhSach();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }while (luachon2<1||luachon2>3||luachon2!=3);
                    break;
                case 4:
                    int luachon3 = 0;
                    do {
                        System.out.println("---TÌM KIẾM SẢN PHẨM---");
                        System.out.println("1.Tìm kiếm theo id");
                        System.out.println("2.Tìm kiếm theo tên");
                        System.out.println("3.Thoát");
                        System.out.println("Nhập vào sự lựa chọn");
                        luachon3 = Integer.parseInt(scanner.nextLine());
                        switch (luachon3){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                iDienThoaiChinhHangService.timKiemID(id);
                                break;
                            case 2:
                                System.out.println("Nhập vào tên sản phẩm : ");
                                String name = scanner.nextLine();
                                iDienThoaiChinhHangService.tinKiemTen(name);
                                break;
                            case 3:
                                break;
                        }
                    }while (luachon3>3||luachon3<1||luachon3!=3);
                    break;
            }
        }while (chon>5||chon<1||chon!=5);
    }
}
