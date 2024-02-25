package thilai.model;

public class ChinhHang extends DienThoai{
    private double thoigianbaohanh;
    private String phamvibaohanh;
    public ChinhHang(){}

    public ChinhHang(int id, String tendienthoai,String giaban,String soluong, String nhasanxuat, double thoigianbaohanh, String phamvibaohanh) {
        super(id, tendienthoai, giaban, soluong, nhasanxuat);
        this.thoigianbaohanh = thoigianbaohanh;
        this.phamvibaohanh = phamvibaohanh;
    }

    public double getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(double thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    public String getPhamvibaohanh() {
        return phamvibaohanh;
    }

    public void setPhamvibaohanh(String phamvibaohanh) {
        this.phamvibaohanh = phamvibaohanh;
    }

    @Override
    public String toString() {
        return "ChinhHang{" +
                "thoigianbaohanh='" + thoigianbaohanh + '\'' +
                ", phamvibaohanh='" + phamvibaohanh + '\'' +
                '}';
    }
}
