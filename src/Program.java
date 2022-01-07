import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("Exemple de creation de cercle avec deux points");
        Point point1 = new Point(200,200);
        Point centre1 = new Point(100,100);
        Point centre2 = new Point(130,100);
        Point point2 = new Point(120,100);
        Cercle cercle1 = new Cercle(centre1,point1);
        Cercle cercle2 = new Cercle(point2, 40);
        if(cercle1.appartient(point2)) {
            System.out.println("Le point appartient au cercle");
        } else {
            System.out.println("Le point est hors du cercle");
        }

        System.out.println("Le périmetre de " + cercle1 + " est egale à :" + cercle1.getPerimetre());
        System.out.println("La surface de " + cercle1 + " est egale à :" + cercle1.getSurface());
        System.out.println("--------------------");
        System.out.println("Le périmetre de " + cercle2 + " est egale à :" + cercle1.getPerimetre());
        System.out.println("La surface de " + cercle2 + " est egale à :" + cercle1.getSurface());
        System.out.println("--------------------");


        Scanner s = new Scanner(System.in);
        System.out.println("--Definissez votre cercle--");
        System.out.println("Donner le x du centre: ");
        int x1 = s.nextInt();
        System.out.println("Donner le y du centre: ");
        int y1 = s.nextInt();
        System.out.println("Donner le rayon: ");
        int r1 = s.nextInt();
        Point newPoint = new Point(x1,y1);
        Cercle newCercle = new Cercle(newPoint, r1);
        System.out.println(newCercle);
        System.out.println("Le périmetre de " + newCercle + " est egale à :" + newCercle.getPerimetre());
        System.out.println("La surface de " + newCercle + " est egale à :" + newCercle.getSurface());

        System.out.println("Choissisez un point :");
        System.out.println("Donner le x : ");
        int x2 = s.nextInt();
        System.out.println("Donner le y : ");
        int y2 = s.nextInt();
        Point searchPoint = new Point(x2,y2);
        System.out.println(searchPoint);

        if(newCercle.appartient(searchPoint)) {
            System.out.println("Le point appartient au cercle");
        } else {
            System.out.println("Le point est hors du cercle");
        }


    }
}
