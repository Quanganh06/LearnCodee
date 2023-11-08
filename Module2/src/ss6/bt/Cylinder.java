package ss6.bt;

public class Cylinder extends Circlee {
    private double height;

    public Cylinder(int radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bankinh " + super.getRadius() + ", mau sac: " + super.getColor()+" Dien tich: "+Area();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "red", 2);
        System.out.println(cylinder.toString());
    }
}

