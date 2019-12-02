package model;

import view.MyDisplay;

import java.util.ArrayList;

public class World {

    public ArrayList<Shape> Shapes;
    private MyDisplay d;

    public void add(Shape s){
        Shapes.add(s);


    }


}
