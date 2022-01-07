public class Point {

        protected int x;
        protected int y;

        public Point() {
            super();
        }

        public Point(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point (" + x + ";" + y + ")";
        }

        public double distance(Point p) {

            //Calcul la difference des x
            int a = p.x - this.x;

            //Calcul la difference des  y
            int b = p.y - this.y;

            return Math.sqrt(a*a + b*b);
        }
}
