package classesandmethods;

import org.w3c.dom.css.Rect;

public class Triangle extends Rectangle {

    int height;



    public Triangle(int ln, int b, int height) {
        super(ln, b);
        this.height = height;
    }

    public int areaofTria(){
        return height*this.length*this.breadth;
    }
}
