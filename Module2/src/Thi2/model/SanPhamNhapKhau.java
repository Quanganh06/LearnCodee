package Thi2.model;

public class SanPhamNhapKhau extends SanPham{
    private String gianhapkhau;
    private String tinhnhap;
    private String thuenhapkhau;
    public SanPhamNhapKhau(int id, String tensanpham, String giaban, String soluong, String nhasanxuat, String gianhapkhau, String tinhnhap, String thue){}
    public SanPhamNhapKhau(String idsanpham, String masanpham, String tensanpham, String giaban, String soluong, String nhasanxuat, String gianhapkhau, String tinhnhap, String thuenhapkhau) {
        super(idsanpham, masanpham, tensanpham, giaban, soluong, nhasanxuat);
        this.gianhapkhau = gianhapkhau;
        this.tinhnhap = tinhnhap;
        this.thuenhapkhau = thuenhapkhau;
    }

    public String getGianhapkhau() {
        return gianhapkhau;
    }

    public void setGianhapkhau(String gianhapkhau) {
        this.gianhapkhau = gianhapkhau;
    }

    public String getTinhnhap() {
        return tinhnhap;
    }

    public void setTinhnhap(String tinhnhap) {
        this.tinhnhap = tinhnhap;
    }

    public String getThuenhapkhau() {
        return thuenhapkhau;
    }

    public void setThuenhapkhau(String thuenhapkhau) {
        this.thuenhapkhau = thuenhapkhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                "giasanpham='" + gianhapkhau + '\'' +
                ", tinhnhap='" + tinhnhap + '\'' +
                ", thuenhapkhau='" + thuenhapkhau + '\'' +
                '}';
    }
}
