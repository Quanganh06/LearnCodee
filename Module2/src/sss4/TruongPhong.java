package sss4;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double luongTN;
    public TruongPhong() {
        super();
        this.luongTN = luongTN;
    }

    public double getLuongTN() {
        return luongTN;
    }

    public void setLuongTN(double luongTN) {
        this.luongTN = luongTN;
    }

    public double xuatThong() {
        return 0;
    }

    @Override
    public void NhapThongTin() {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap luong trach nhiem: ");
        luongTN = s.nextDouble();

    }
    public void xuatThongTin() {
        System.out.println("Thông tin nhân viên hành chính:");
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Lương: " + getLuong());
        System.out.println("luong trach nhiem: "+getLuongTN());
    }
    @Override
    public double getThuNhap(){
        return super.getLuong() + luongTN;
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
    public String toString() {
        return "TruongPhong{" +
                "luongTN=" + luongTN +
                '}';
    }
}
