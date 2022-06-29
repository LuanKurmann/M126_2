package Grafikeditor1.Figures;

import java.awt.*;

public abstract class Figur {
    protected int x, y, liniendicke;
    public Figur(int xPos, int yPos, int liniendicke) {
        this.x = xPos;
        this.y = yPos;
        this.liniendicke = liniendicke;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLiniendicke() {
        return liniendicke;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int deltaX, int deltaY){
        this.x = deltaX;
        this.y = deltaY;
    }


    public abstract void groesseAendern(float faktor);

    public abstract void zeichne(Graphics g);

    public abstract String toString();
}
