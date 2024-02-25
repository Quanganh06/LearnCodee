package ThiModule2.model;

public class TkThanhtoan extends TkBank{
    private int sothe;
    private double sotien;
    public TkThanhtoan(String s, String maTk, String name, String ngaytaotk, String s1, String s2){

    }
    public TkThanhtoan(int id,String MaTk,String name,String ngaytaotk,int sothe,double sotien){
        super(id, MaTk,name,ngaytaotk);
        this.sothe=sothe;
        this.sotien=sotien;
    }

    public int getSothe() {
        return sothe;
    }

    public void setSothe(int sothe) {
        this.sothe = sothe;
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    @Override
    public String toString() {
        return "TkThanhtoan{" +
                "sothe=" + sothe +
                ", sotien=" + sotien +
                '}';
    }
}
