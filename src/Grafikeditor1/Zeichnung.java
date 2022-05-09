package Grafikeditor1;


import Grafikeditor1.Figures.Figur;

import java.awt.*;
import java.util.ArrayList;

public class Zeichnung {
    private ArrayList<Figur> figuren;

    public Zeichnung() {this.figuren = new ArrayList<>();}

    public Zeichnung(ArrayList<Figur> figuren) {
        this.figuren = figuren;
    }

    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics2D g) {
        for (Figur f : figuren) {
            f.zeichne(g);
        }
    }

    /**
     * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    /**
     * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
    }

    public ArrayList<Figur> getFiguren() {
        return figuren;
    }
}
