package ss6.bt;

public class Circlee {
    private int bankinh;
    private String color;

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh() {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Circlee() {
    }

    public Circlee(int bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double Area() {
        return Math.PI * bankinh * bankinh;
    }
}

