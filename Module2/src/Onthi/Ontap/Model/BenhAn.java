package Onthi.Ontap.Model;

public abstract class BenhAn {
    private String mabenhnhan;
    private String tenbenhnhan;
    private String ngaynhapvien;
    private String ngayxuatvien;
    private String lidobenh;
    public BenhAn (){}

    public BenhAn(String mabenhnhan, String tenbenhnhan, String ngaynhapvien, String ngayxuatvien, String lidobenh) {
        this.mabenhnhan = mabenhnhan;
        this.tenbenhnhan = tenbenhnhan;
        this.ngaynhapvien = ngaynhapvien;
        this.ngayxuatvien = ngayxuatvien;
        this.lidobenh = lidobenh;
    }

    public String getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(String mabenhnhan) {
        this.mabenhnhan = mabenhnhan;
    }

    public String getTenbenhnhan() {
        return tenbenhnhan;
    }

    public void setTenbenhnhan(String tenbenhnhan) {
        this.tenbenhnhan = tenbenhnhan;
    }

    public String getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(String ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public String getNgayxuatvien() {
        return ngayxuatvien;
    }

    public void setNgayxuatvien(String ngayxuatvien) {
        this.ngayxuatvien = ngayxuatvien;
    }

    public String getLidobenh() {
        return lidobenh;
    }

    public void setLidobenh(String lidobenh) {
        this.lidobenh = lidobenh;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "mabenhnhan='" + mabenhnhan + '\'' +
                ", tenbenhnhan='" + tenbenhnhan + '\'' +
                ", ngaynhapvien='" + ngaynhapvien + '\'' +
                ", ngayxuatvien='" + ngayxuatvien + '\'' +
                ", lidobenh='" + lidobenh + '\'' +
                '}';
    }
}
