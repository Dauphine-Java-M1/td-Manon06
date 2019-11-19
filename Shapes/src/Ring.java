public class Ring extends Circle {

    private double rayon;
    private Point centre;
    private double rayon_interne;

    public Ring() {
        this.centre = new Point(2,2);
        this.rayon_interne = 1;
        this.rayon=2;
    }

     public Ring(Point c, double rayon, double rayon_interne){
        super(c,rayon);
        this.rayon_interne=rayon_interne;

     }

    /*public Ring(Point c, double rayon, double rayon_interne) {
            if (rayon_interne <= rayon) {
                this.rayon_interne = rayon_interne;
            }else {
                throw new IllegalArgumentException("Il faut avoir rayon-interne <= rayon ");
            }
        }*/

    public boolean equals (Object ring){

            System.out.println(ring);

            if (ring == this) {
                    return true;
                }
                if (ring instanceof Ring) {
                    return true;
                }
                Ring r = (Ring) ring;
                return this.rayon_interne == r.rayon_interne && this.centre.equals(r.centre);

        }


    public boolean contains(Point p){
        if((p.getX()-centre.getX())*(p.getX()-centre.getX())
                +(p.getY()-centre.getY())*(p.getY()-centre.getY())<= rayon*rayon)
        {
            return true;
        }
        return false;
    }

    public boolean contains(Point p, Ring...rings){
        for(Ring ring:rings)
        {
            if(ring.contains(p)) {

                return true;
            }
        }
        return false;

    }

}


