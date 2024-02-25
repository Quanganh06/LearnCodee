package thilai.model;

public abstract class DienThoai {
    private int id;
    private String tendienthoai;
    private String giaban;
    private String soluong;
    private String nhasanxuat;
    public DienThoai(){

    }

    public DienThoai(int id, String tendienthoai, String giaban, String soluong, String nhasanxuat) {
        this.id = id;
        this.tendienthoai = tendienthoai;
        this.giaban = giaban;
        this.soluong=soluong;
        this.nhasanxuat = nhasanxuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendienthoai() {
        return tendienthoai;
    }

    public void setTendienthoai(String tendienthoai) {
        this.tendienthoai = tendienthoai;
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
        return "DienThoai{" +
                "id=" + id +
                ", tendienthoai='" + tendienthoai + '\'' +
                ", giaban='" + giaban + '\'' +
                ", soluong='" + soluong + '\'' +
                ", nhasanxuat='" + nhasanxuat + '\'' +
                '}';
    }
}
