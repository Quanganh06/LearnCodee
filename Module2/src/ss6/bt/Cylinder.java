package ss6.bt;

public class Cylinder extends Circlee {
    private double height;

    public Cylinder(int bankinh, String color, double height) {
        super(bankinh, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Bankinh"+super.getBankinh()+",mau sac: "+super.getColor();
    }

    public static void main(String[] args) {
        Circlee cylinder=new Cylinder(5,"red",2);

    }
}
