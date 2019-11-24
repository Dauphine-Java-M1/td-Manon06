public class Circle {

    private double rayon;   //rayon du cercle
    private Point centre;   //Point du cercle

    public Circle(){        //Constructeur du cercle
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

    // toString() ==> affichage debug de l'objet
    public String toString() {
        return " le cercle a pour rayon " + rayon;
    }



    //EXERCICE 4 : MUTABILITE ET CERCLE

    public void translate(int dx, int dy) {
        //attention: on garde la même signature que le constructeur Circle qui n'est pas sans argument
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
