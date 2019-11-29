package view;

import javax.swing.*;
import java.awt.*;

public class MyDisplay extends JPanel {

    int x1;
    int y1;
    int x2;
    int y2;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(100,100,300,300);
       // g.drawOval(100,100,50,50);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Java Avance - Graphic Display");
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDisplay d = new MyDisplay();
        frame.add(d);
    }

}
