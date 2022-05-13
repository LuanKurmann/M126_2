package Grafikeditor1.Figures;

import java.awt.*;
import java.util.ArrayList;

public class SchneemannFamillie extends Figur {

    ArrayList<Figur> teilFiguren = new ArrayList<>();
    int breite;

    public SchneemannFamillie(int x, int y, int liniendicke, int groesse) {
        super(x, y, liniendicke);
        this.breite = breite;
        teilFiguren.add(new Schneemann(x,y,groesse/3,liniendicke));
        teilFiguren.add(new Schneemann(x + (groesse/3),y,groesse/3,liniendicke));
        teilFiguren.add(new Schneemann(x+(groesse/3*2),y,groesse/3,liniendicke));
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        for(Figur f : teilFiguren) {
            f.move(deltaX, deltaY);
        }
    }

    @Override
    public void groesseAendern(float faktor) {

    }

    @Override
    public void zeichne(Graphics2D g) {
        for (Figur f: teilFiguren){
            f.zeichne(g);
        }
    }

    public ArrayList<Figur> getTeilFiguren() {
        return teilFiguren;
    }


}


