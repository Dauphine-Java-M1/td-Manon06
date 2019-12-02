import model.Shape;
import view.DrawCircle;
import view.Drawable;

import java.awt.*;

public class Circle extends Shape {

    private double rayon;
    private Point centre;


    public void drawShape(Graphics g) {
        Drawable dc = new DrawCircle();
        //dc = new DrawCircle(this);
        dc.draw(g);
    }

    public Circle(){
        this.centre=new Point(1,1);
        this.rayon=1;
    }
    public Circle(Point centre,double rayon) {
        this.centre=centre;
        this.rayon=rayon;
    }

    public void setCenter(){
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void Circle() {
        centre = new Point();
        this.rayon = 3;
    }

    public String toString() {
        return " le cercle a pour rayon " + rayon;
    }


    public void translate(int dx, int dy) {
        this.centre.setX(this.centre.getX() + dx);
        this.centre.setY(this.centre.getY() + dy);
    }

    public double surface() {
        double sur=Math.PI*this.rayon*this.rayon;
        return sur;
    }


    public boolean contains(Point p) {
        if((p.getX()-centre.getX())*(p.getX()-centre.getX())
                +(p.getY()-centre.getY())*(p.getY()-centre.getY())<= rayon*rayon)
        {
            return true;
        }
        return false;
    }

    public  boolean contains(Point p, Circle...circles) {
        for(Circle cercle:circles)
        {
            if(cercle.contains(p)) {

                return true;
            }
        }
        return false;

    }

}
