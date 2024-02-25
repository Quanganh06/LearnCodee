package Onthi.Ontap.Model;

public class BenhAnThuong extends BenhAn{
    private String phi;
    public BenhAnThuong(){}

    public BenhAnThuong(String phi) {
        this.phi = phi;
    }

    public BenhAnThuong(String mabenhnhan, String tenbenhnhan, String ngaynhapvien, String ngayxuatvien, String lidobenh, String phi) {
        super(mabenhnhan, tenbenhnhan, ngaynhapvien, ngayxuatvien, lidobenh);
        this.phi = phi;
    }

    public String getPhi() {
        return phi;
    }

    public void setPhi(String phi) {
        this.phi = phi;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "phi='" + phi + '\'' +
                '}';
    }
}
