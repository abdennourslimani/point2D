package point2D;

import java.util.Arrays;

public class Point3D extends Point2D{

        int z ;

    public Point3D() {
        super();
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z ;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void afficher(){
        int[] myPoint = {getX(),getY(),z};
        System.out.println(Arrays.toString(myPoint));

    }

    public void translater(int dx,int dy,int dz){
        setX(getX() + dx) ;
        setY(getY() + dy) ;
        z+=dz ;

        int[] myPoint = {getX(),getY(),z};
        System.out.println(Arrays.toString(myPoint));
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "z=" + z +
                '}';
    }
}
