package ss6.bt;

public class Circlee {
    private int radius;
    private String color;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circlee() {
    }

    public Circlee(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}

