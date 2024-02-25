package thi.Model;

public class SanPhamXuatKhau extends SanPham{
    private double giaNhapKhau;
    private String quocGiaNhapKhauSanPham;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int maSanPham, String tenSanPham, Double giaBan, int soLuong, String nhaSanXuat, double giaNhapKhau, String quocGiaNhapKhauSanPham) {
        super(maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.quocGiaNhapKhauSanPham = quocGiaNhapKhauSanPham;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getQuocGiaNhapKhauSanPham() {
        return quocGiaNhapKhauSanPham;
    }

    public void setQuocGiaNhapKhauSanPham(String quocGiaNhapKhauSanPham) {
        this.quocGiaNhapKhauSanPham = quocGiaNhapKhauSanPham;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" + super.toString() +
                "giaNhapKhau=" + giaNhapKhau +
                ", quocGiaNhapKhauSanPham='" + quocGiaNhapKhauSanPham + '\'' +
                '}';
    }
}
