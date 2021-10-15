package point2D;

import java.util.Arrays;

public class Point2D {
    private  int x ;
    private  int y ;
    private static int compteur ;

    public Point2D() {
        this.x = 0 ;
        this.y = 0 ;
        compteur++;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }

    public void afficher(){
        int[] myPoint = {x,y};
        System.out.println(Arrays.toString(myPoint));

    }

    public void translater(int dx,int dy){
        x+=dx ;
        y+=dy ;
        int[] myPoint = {x,y};
        System.out.println(Arrays.toString(myPoint));
    }

    public  static void  getCompteur(){
        System.out.println(  compteur + " Instances crées ");

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "DessinPoint2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
