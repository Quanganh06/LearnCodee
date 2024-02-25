package sss4;

public abstract class NhanVien {
    private String id;
    private String name;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String id, String name, double luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    // Phương thức tính thuế thu nhập
    public abstract double getThuNhap();
    public abstract double getThue();
//    public double tinhThuNhap() {
//        double tongThuNhap = this.luong;
//        if (this instanceof NhanVienTiepThi) {
//            tongThuNhap += ((NhanVienTiepThi) this).tinhThuNhapTiepThi();
//        }
//        if (this instanceof TruongPhong) {
//            tongThuNhap += ((TruongPhong) this).getLuongTrachNhiem();
//        }
//
//        return tongThuNhap;
//    }

//    public double ThueThuNhap() {
//        double thuNhap = tinhThuNhap();
//        double thue = 0;
//
//        // Áp dụng các mức thuế thu nhập theo phương pháp lũy tiến
//        if (thuNhap <= 9000000) {
//            thue = 0; // Không đóng thuế
//        } else if (thuNhap > 9000000 && thuNhap <= 15000000) {
//            thue = 0.1 * (thuNhap - 9000000); // Thuế 10% cho mức thu nhập từ 9 triệu đến 15 triệu
//        } else {
//            thue = 0.1 * (15000000 - 9000000) + 0.12 * (thuNhap - 15000000); // Thuế 12% cho mức thu nhập trên 15 triệu
//        }
//
//        return thue;
//    }



    public abstract void xuatThongTin();
    public abstract void NhapThongTin();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", luong: " + luong +",Tong luong: "+getThuNhap()+",thue: "+getThue();

    }
}
