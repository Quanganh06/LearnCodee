package ThiModule2.model;

public abstract class TkBank {
    private int id;
    private String MaTK;
    private String name;
    private String ngaytaotk;
    public TkBank(){

    }
    public TkBank(int id,String MaTk,String name,String ngaytaotk){
        this.id=id;
        this.MaTK=MaTk;
        this.name =name;
        this.ngaytaotk=ngaytaotk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String maTK) {
        MaTK = maTK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaytaotk() {
        return ngaytaotk;
    }

    public void setNgaytaotk(String ngaytaotk) {
        this.ngaytaotk = ngaytaotk;
    }

    @Override
    public String toString() {
        return "TkBank{" +
                "id=" + id +
                ", MaTK='" + MaTK + '\'' +
                ", name='" + name + '\'' +
                ", ngaytaotk='" + ngaytaotk + '\'' +
                '}';
    }
}
