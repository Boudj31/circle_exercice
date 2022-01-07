public class Cercle {

    private Point centre;
    private double rayon;

    public Cercle() {
        super();
    }

    /**
     * Prend en paramètre un point qui represente le centre du cercle
     * @param centre
     * @param rayon
     */
    public Cercle(Point centre, double rayon) {
        super();
        this.centre = centre;
        this.rayon = rayon;
    }

    /**
     * Prend en parmètre un point qui represente le centre du cercle
     * et un point qui represente un point sur le cercle
     * @param centre
     * @param point
     */
    public Cercle(Point centre, Point point) {
        super();
        this.centre = centre;
        this.rayon = centre.distance(point);
    }


    /**
     * Retourne le perimètre du cercle
     * @return
     */
    public double getPerimetre() {
        return 2*Math.PI*rayon;
    }

    public double getSurface() {
        return Math.PI*rayon*rayon;
    }

    /**
     * Retourne si le point p appartient ou non à l'interieur du cercle
     * @param p
     * @return
     */
    public boolean appartient(Point p) {
        double d = centre.distance(p);
        return d<=rayon;
    }

    /**
     * retourne une chaîne de caractères de type CERCLE(x,y,R)
     */
    @Override
    public String toString() {
        return "Cercle(" + centre.x + ", " + centre.y + ", " + rayon + ")";
    }

}
