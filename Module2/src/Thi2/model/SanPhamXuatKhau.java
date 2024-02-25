package Thi2.model;

public class SanPhamXuatKhau extends SanPham{
    private String giaxuatkhau;
    private String quocgianhap;
   public SanPhamXuatKhau(int id, String tensanpham, String giaban, String soluong, String nhasanxuat, String giaxuatkhau, String quocgianhapp){}

    public SanPhamXuatKhau(String idsanpham, String masanpham, String tensanpham, String giaban, String soluong, String nhasanxuat, String giaxuatkhau, String quocgianhap) {
        super(idsanpham, masanpham, tensanpham, giaban, soluong, nhasanxuat);
        this.giaxuatkhau = giaxuatkhau;
        this.quocgianhap = quocgianhap;
    }

    public String getGiaxuatkhau() {
        return giaxuatkhau;
    }

    public void setGiaxuatkhau(String giaxuatkhau) {
        this.giaxuatkhau = giaxuatkhau;
    }

    public String getQuocgianhap() {
        return quocgianhap;
    }

    public void setQuocgianhap(String quocgianhap) {
        this.quocgianhap = quocgianhap;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "giaxuatkhau='" + giaxuatkhau + '\'' +
                ", quocgianhap='" + quocgianhap + '\'' +
                '}';
    }
}
