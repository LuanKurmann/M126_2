package Grafikeditor1.Figures;

import java.awt.*;

public class Ellipse extends Figur{
    private int radiusX, radiusY;

    public Ellipse(int xPos, int yPos, int radiusX, int radiusY, int liniendicke) {
        super(xPos, yPos, liniendicke);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }

    @Override
    public void groesseAendern(float faktor){
        liniendicke = (int)(liniendicke*faktor);
        radiusX = (int)(radiusX*faktor);
        radiusY = (int)(radiusY*faktor);
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.drawOval(x,y,radiusX,radiusY);
    }

    @Override
    public String toString() {
        return ("Kreis: Radius-X: " + radiusX + " Radius-Y: " + radiusY);
    }
}
