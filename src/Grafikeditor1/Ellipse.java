package Grafikeditor1;

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
}
