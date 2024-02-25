package ss16.bt.Docfile;

public class Country {
    private int id;
    private String name;
    private  String code;
    public Country(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country(int id, String name, String code){
        this.id=id;
        this.name=name;
        this.code=code;

    }

    @Override
    public String toString() {
        return "Country{ "+
                "id ="+id+
                ", name ="+name+"}" ;
    }
}
