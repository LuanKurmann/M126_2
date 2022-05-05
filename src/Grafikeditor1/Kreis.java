package Grafikeditor1;

public class Kreis extends Ellipse{
    private int radius;

    public Kreis(int xPos, int yPos, int radius, int liniendicke) {
        super(xPos,yPos,radius,radius, liniendicke);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
