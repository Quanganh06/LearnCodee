package Onthi.Ontap.Model;

public class BenhAnVip extends BenhAn{
    private String loaivip;
    public BenhAnVip(){}

    public BenhAnVip(String mabenhnhan, String tenbenhnhan, String ngaynhapvien, String ngayxuatvien, String lidobenh, String loaivip) {
        super(mabenhnhan, tenbenhnhan, ngaynhapvien, ngayxuatvien, lidobenh);
        this.loaivip = loaivip;
    }

    public String getLoaivip() {
        return loaivip;
    }

    public void setLoaivip(String loaivip) {
        this.loaivip = loaivip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "loaivip='" + loaivip + '\'' +
                '}';
    }
}
