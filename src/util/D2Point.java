package util;

/**
 * Created by jackchampagne on 9/14/17.
 * Represents a point in 2d space as a D2Point
 */
public class D2Point {

    private double x;
    private double y;

    D2Point(double x, double y){
        x = x;
        y = y;
    }

    void transform(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return (int)x;
    }

    public int getY() {
        return (int)y;
    }

}
