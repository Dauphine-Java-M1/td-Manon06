import java.util.ArrayList;
import java.util.LinkedList;

    // EXERCICE 1 POINTS

public class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public Point() {
            this.x=0;
            this.y=0;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


        public static void main(String [ ]args) {

            Point p1=new Point(1,2);
            Point p2=p1;
            //Point p3=new Point(1,2);
            Point p3=p1;
            System.out.println(p1==p2);
            System.out.println(p1==p3);

            ArrayList<Point> list = new ArrayList<Point>();
            list.add(p1);
            System.out.println(list.indexOf(p2));
            System.out.println(list.indexOf(p3));

            Ring r=new Ring(p1,3,2);


            Point p=new Point(1,2);
            Circle c=new Circle(p,1);
            Circle c2=new Circle(p,2);
            c2.translate(1,1);
            System.out.println(c+" "+c2);
        }

        //EXERCICE 2 LIGNE BRISEE

        private LinkedList<Point>suitePoints;
        private int maxPoints;

        public void lignebrisee(){
                suitePoints=new LinkedList<Point>();
            }

        public void add(Point p){
            if(suitePoints==null)
            {  this.suitePoints=new LinkedList<Point>(); }
            suitePoints.add(p);
        }

        public int pointCapacity(){
            return maxPoints;
        }

        public int nbPoints(){
            return suitePoints.size();
        }

        public boolean contains(Point p){
            for (Point point: suitePoints) {
                if(point.equals(p)){
                    return true;
                }
            }
            return false;
        }




}




