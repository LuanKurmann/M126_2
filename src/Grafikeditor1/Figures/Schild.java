package Grafikeditor1.Figures;

import java.awt.*;
import java.util.ArrayList;

public class Schild extends Figur{

    ArrayList<Figur> teilFiguren = new ArrayList<>();
    int breite;
    int laenge;

    public Schild(int x, int y, int breite,int laenge, int liniendicke) {
        super(x, y, liniendicke);
        this.breite = breite;
        this.laenge = laenge;
        teilFiguren.add(new Rechteck(x,y,laenge,breite,liniendicke));
        teilFiguren.add(new Linie(x + breite/2,y+ laenge,x + breite/2,y + laenge * 2,liniendicke));
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
    public void zeichne(Graphics g) {
        for (Figur f: teilFiguren){
            f.zeichne(g);
        }
    }

    public ArrayList<Figur> getTeilFiguren() {
        return teilFiguren;
    }

    @Override
    public String toString() {
        return ("laenge: " + laenge + "breite: " + breite);
    }
}
