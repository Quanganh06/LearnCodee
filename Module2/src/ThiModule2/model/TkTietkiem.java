package ThiModule2.model;

public class TkTietkiem extends TkBank{
    private double sotientk;
    private String ngaygui;
    private double laisuat;
    private String kihan;
    public TkTietkiem(String s, String s1, String s2, String s3, String s4, String s5){

    }
    public TkTietkiem(int id,String MaTk,String name,String ngaytaotk,double sotientk,String ngaygui,double laisuat,String kihan){
        super( id, MaTk,name,ngaytaotk);
        this.sotientk=sotientk;
        this.ngaygui=ngaygui;
        this.laisuat=laisuat;
        this.kihan=kihan;
    }

    public double getSotientk() {
        return sotientk;
    }

    public void setSotientk(double sotientk) {
        this.sotientk = sotientk;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }

    public double getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }

    public String getKihan() {
        return kihan;
    }

    public void setKihan(String kihan) {
        this.kihan = kihan;
    }

    @Override
    public String toString() {
        return "TkTietkiem{" +
                "sotientk=" + sotientk +
                ", ngaygui='" + ngaygui + '\'' +
                ", laisuat=" + laisuat +
                ", kihan='" + kihan + '\'' +
                '}';
    }
}
