package sss4;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{
    private double luongKD;
    private double HoaHong;

    public NhanVienTiepThi() {
        super();
    }

    public NhanVienTiepThi(String id, String name, double luong, double luongKD, double HoaHong) {
        super();
        this.luongKD = luongKD;
        this.HoaHong = HoaHong;
    }

    public double getLuongKD() {
        return luongKD;
    }

    public void setLuongKD(double luongKD) {
        this.luongKD = luongKD;
    }

    public double getHoaHong() {
        return HoaHong;
    }

    public void setHoaHong(double HoaHong) {
        this.HoaHong = HoaHong;
    }


    @Override
    public void NhapThongTin() {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap luong kinh doanh: ");
        luongKD = s.nextDouble();
        System.out.println("nhap hoa hong: ");
        HoaHong = s.nextDouble();

    }
    public void xuatThongTin() {
        System.out.println("Thông tin nhân viên tiep thi :");
        System.out.println("Mã nhân viên: " + getId());
        System.out.println("Tên nhân viên: " + getName());
        System.out.println("Lương: " + getLuong());
        System.out.println("luong KD: " + luongKD
                + "\t\t hoa hong: " + HoaHong);
    }
    @Override
    public double getThuNhap() {
        return super.getLuong()+luongKD*HoaHong;
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
        return "NhanVienTiepThi{" +
                "luongKD=" + luongKD +
                ", HoaHong=" + HoaHong +
                '}';
    }
}
