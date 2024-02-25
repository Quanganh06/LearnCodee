package thilai.model;

public class XachTay extends DienThoai {
    private String quocgiaxachtay;
    private String trangthai;

    public XachTay() {
    }

    public XachTay(int id, String tendienthoai, String giaban, String soluong, String nhasanxuat, String quocgiaxachtay, String trangthai) {
        super(id, tendienthoai, giaban, soluong, nhasanxuat);
        this.quocgiaxachtay = quocgiaxachtay;
        this.trangthai = trangthai;
    }

    public String getQuocgiaxachtay() {
        return quocgiaxachtay;
    }

    public void setQuocgiaxachtay(String quocgiaxachtay) {
        this.quocgiaxachtay = quocgiaxachtay;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "XachTay{" +
                "quocgiaxachtay='" + quocgiaxachtay + '\'' +
                ", trangthai='" + trangthai + '\'' +
                '}';
    }
}

