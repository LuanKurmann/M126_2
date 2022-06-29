package Grafikeditor1.Figures;

import java.awt.*;
import java.util.ArrayList;

public class Schneemann extends Figur {
    ArrayList<Figur> teilFiguren = new ArrayList<>();
    int breite;

    public Schneemann(int x, int y, int breite, int liniendicke) {
        super(x, y, liniendicke);
        this.breite = breite;
        teilFiguren.add(new Kreis(x + breite - (breite/25*10), y, breite/25*20,liniendicke));
        teilFiguren.add(new Kreis(x + breite - (breite/15*10), y + (breite/25*19), breite/15*20,liniendicke));
        teilFiguren.add(new Kreis(x, y + ((breite/15*19) + (breite/25*19)), breite/10*20, liniendicke));
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
        return ("breite: " + breite);
    }

}

