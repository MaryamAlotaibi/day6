public class Point2D {
    private float x;
    private float y;


public void Point2D(float x, float y) {
}
public Point2D(){

}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public void setXY(float x,float y) {
        int[][] arr = new int[10][20];
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D{

    private float z;

    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        this.z=z;
}



    public void setXY(float x,float y) {
        int[][][] arr = new int[10][30][20];
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
