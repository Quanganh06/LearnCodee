package sss4;

import java.util.Scanner;

public class NhanVienHanhChinh extends NhanVien{
    private double luongThang;


    public NhanVienHanhChinh() {
        super();
        this.luongThang = luongThang;
    }

    @Override
    public double getThuNhap() {
        return luongThang;
    }

    @Override
    public double getThue() {
        double thunhap = getLuong();
        if (thunhap<9000000){
            return 0;
        } else if (thunhap>9000000&&thunhap<15000000) {
            return thunhap * 0.1;
        }else {
            return thunhap*0.12;

        }
    }
    @Override
    public void NhapThongTin() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap luong thang ");
        luongThang=scanner.nextDouble();
    }
    @Override
    public void xuatThongTin() {
        System.out.println("Thông tin nhân viên hành chính:");
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Lương: " + getLuong());
    }


}
