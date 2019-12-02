package view;
import model.*;
import model.Shape;

import javax.swing.*;
import java.awt.*;


public class MyDisplay extends JPanel {

    int x1;
    int y1;
    int x2;
    int y2;
    private World wi;


    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(100,100,300,300);
        for(Shape s:this.wi.Shapes){
         s.drawShape(g);}
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Java Avance - Graphic Display");
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        World w = new World();
        MyDisplay d = new MyDisplay();
        frame.add(d);

    }

}
