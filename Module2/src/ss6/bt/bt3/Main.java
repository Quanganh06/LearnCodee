package ss6.bt.bt3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.5f, 2.8f);
        System.out.println("Point: " + point);
        point.setXY(1.2f, 5.6f);
        System.out.println("New Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint: " + movablePoint);
        movablePoint.move();
        System.out.println("Moved MovablePoint: " + movablePoint);
    }

}
