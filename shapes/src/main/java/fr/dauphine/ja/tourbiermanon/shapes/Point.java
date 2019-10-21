package fr.dauphine.ja.tourbiermanon.shapes;

public class Point {
	private int x;
	private int y;
	static int Nbinstance=0;

	 public static void main( String[] args )
	    {	
		Point p= new Point();
		System.out.println(p.x + "  " + p.y);
		System.out.println(Point.Nbinstance);

	} 
	 
	 public Point(int x, int y, int i) {
		 this.x = x;
	     this.y = y;
	     Nbinstance ++;
	 } 
	 
}
