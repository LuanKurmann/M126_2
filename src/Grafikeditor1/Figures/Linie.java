package Grafikeditor1.Figures;

import java.awt.*;

public class Linie extends Figur{
    private int xEndPos;
    private int yEndPos;

    public Linie(int xPos, int yPos, int xEndPos, int yEndPos, int liniendicke) {
        super(xPos, yPos, liniendicke);
        this.xEndPos = xEndPos;
        this.yEndPos = yEndPos;
    }

    public int getxEndPos() {
        return xEndPos;
    }

    public int getyEndPos() {
        return yEndPos;
    }

    public void move(int deltaX, int deltaY, int deltaX2, int deltaY2) {
        super.move(deltaX, deltaY);

        xEndPos = deltaX2;
        yEndPos = deltaY2;
    }

    @Override
    public void groesseAendern(float faktor){
        liniendicke=(int)(liniendicke*faktor);
        xEndPos = (int)(xEndPos*faktor);
        yEndPos = (int)(yEndPos*faktor);
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawLine(x,y,xEndPos,yEndPos);
    }

    @Override
    public String toString() {
        return ("Linie: yEndPos: " + yEndPos + " xEndPos: " + xEndPos);
    }
}
