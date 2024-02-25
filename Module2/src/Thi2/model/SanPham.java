package Thi2.model;

public abstract class SanPham {
    private String idsanpham;
    private String masanpham;
    private String tensanpham;
    private String giaban;
    private String soluong;
    private String nhasanxuat;
    public SanPham(){}

    public SanPham(String idsanpham, String masanpham, String tensanpham, String giaban, String soluong, String nhasanxuat) {
        this.idsanpham = idsanpham;
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.giaban = giaban;
        this.soluong = soluong;
        this.nhasanxuat = nhasanxuat;
    }

    public String getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(String idsanpham) {
        this.idsanpham = idsanpham;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getGiaban() {
        return giaban;
    }

    public void setGiaban(String giaban) {
        this.giaban = giaban;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "idsanpham='" + idsanpham + '\'' +
                ", masanpham='" + masanpham + '\'' +
                ", tensanpham='" + tensanpham + '\'' +
                ", giaban='" + giaban + '\'' +
                ", soluong='" + soluong + '\'' +
                ", nhasanxuat='" + nhasanxuat + '\'' +
                '}';
    }
}
