package sss4;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            NhapDanhSach dsnv = new NhapDanhSach() {
                @Override
                public void NhapThongTin() {
                    super.NhapThongTin();
                }
            };
            Scanner sc = new Scanner(System.in);
            int Choice;
            do {

                System.out.println("       \n\t\t\t\t|----------------------------MENU----------------------------|");
                System.out.println("       \t\t\t\t|  1. Nhap danh sach nhan vien tu ban phim                 \n");
                System.out.println("       \t\t\t\t|  2. Xuat danh sach nhan vien tu ban phim                 \n");
                System.out.println("       \t\t\t\t|  3. Tim va hien thi nhan vien theo ma nhap tu ban phim   \n");
                System.out.println("       \t\t\t\t|  4. Xoa nhan vien theo ma nhap tu ban phim               \n");
                System.out.println("       \t\t\t\t|  5. Cap nhan thong tin nhan vien theo ma nhap tu an phim \n");
                System.out.println("       \t\t\t\t|  6. Tim cac nhan vien theo khoang luong nhap tu ban phim \n");
                System.out.println("       \t\t\t\t|  7. Sap xep nhan vien theo ho ten                        \n");
                System.out.println("       \t\t\t\t|  8. Sap xep nhan vien theo thu nhap                      \n");
                System.out.println("       \t\t\t\t|  9. Xuat 5 nhan vien co thu nhap cao nhat                \n");
                System.out.println("       \t\t\t\t|  10. Thoat chuong trinh                                  \n");
                System.out.println("       \t\t\t\t|------------------------------------------------------------|");
                System.out.println("--------------------------------------------");
                System.out.print("Moi ban chon chuc nang: ");
                Choice = sc.nextInt();
                switch (Choice) {
                    case 1:
                        System.out.println("Ban da chon Y1");
                        dsnv.NhapThongTin();
                        break;
                    case 2:
                        System.out.println("Ban da chon Y2");
                        dsnv.xuatThongTin();
                        break;
                    case 3:
                        System.out.println("Ban da chon Y3");
                        dsnv.timNhanVien();
                        break;
                    case 4:
                        System.out.println("Ban da chon Y4");
                        dsnv.xoaNhanVien();
                        break;
                    case 5:
                        System.out.println("Ban da chon Y5");
                        dsnv.updateMaNV();
                        break;
                    case 6:
                        System.out.println("Ban da chon Y6");
                        dsnv.timNVtheoluong();
                        break;
                    case 7:
                        System.out.println("Ban da chon Y7");
                        dsnv.sapXepTheoHoTenNV();
                        break;
                    case 8:
                        System.out.println("Ban da chon Y8");
                        dsnv.sapXepTheoThuNhap();
                        break;
                    case 9:
                        System.out.println("Ban da chon Y9");
                        dsnv.top5ThuNhap();
                        break;
                    case 10:
                        System.out.println("Thoat chuong trinh.");
                        return;
                    default:
                        System.out.println("Moi chon lai chuc nang");
                        break;
                }
            } while (Choice != 10);
        }

}
