package ss6.bt.Point;

public class Point3D extends Point2D{
        private float z;

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public Point3D() {
            this(0.0f, 0.0f, 0.0f);
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public void setXYZ(float x, float y, float z) {
            super.setXY(x, y);
            this.z = z;
        }

        public float[] getXYZ() {
            return new float[]{getX(), getY(), z};
        }

        @Override
        public String toString() {
            return "(" + getX() + ", " + getY() + ", " + z + ")";
        }


    public static void main(String[] args) {
       Point2D point2D=new Point2D(3.8f,2.6f);
        System.out.println("Point 2D: "+point2D);
        point2D.setXY(1.2f, 5.6f);
        System.out.println("New Point2D: " + point2D);
        Point3D point3D=new Point3D(1.0f,2.0f,3.0f);
        System.out.println("Point 3d: "+point3D);
        point3D.setXYZ(3.4f,5.8f,2.5f);
        System.out.println("New Point 3D: "+point3D );


    }
    }

