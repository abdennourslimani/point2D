package point2D;

import point2D.Point2D;

public class Main {


    public static void main(String[] args) {
/*
        Point2D dessin1 = new Point2D(3, 5);

        Point2D dessin2 = new Point2D(2, 1);


        Point2D.getCompteur();

 */
        Point3D dessin3 = new Point3D(3, 5, 2);

        Point3D dessin4 = new Point3D(2, 1, 3);
        Point3D dessin5 = new Point3D(4, 2, 3);
        Point3D dessin6 = new Point3D(4, 2, 3);


        dessin3.afficher();
        dessin3.translater(2, 1, 3);

        System.out.println(" ");
        dessin4.afficher();
        dessin4.translater(5, 4, 2);
        System.out.println(" ");

        dessin5.afficher();
        dessin5.translater(2, 1, 2);
        System.out.println(" ");

        dessin6.afficher();
        dessin6.translater(2, 1, 2);
        System.out.println(" ");

        Point3D.getCompteur();

    }


}
