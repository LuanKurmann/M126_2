package Grafikeditor1;

import Grafikeditor1.Figures.Figur;
import Grafikeditor1.Figures.Kreis;
import Grafikeditor1.Figures.Linie;
import Grafikeditor1.Figures.Rechteck;

import java.awt.*;

final class EditorControl {
  private Zeichnung display = new Zeichnung();
  private char figurTyp;
  private Point ersterPunkt;

  public void allesNeuZeichnen(Graphics g) {
    display.zeichneFiguren((Graphics2D) g);
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    Figur figur = null;
    int breite = (int)(zweiterPunkt.getX() - ersterPunkt.getX());
    int laenge = (int)(zweiterPunkt.getY()- ersterPunkt.getY());
    int liniendicke = 1;
    switch (figurTyp) {
      case 'r':
        figur = new Rechteck((int)ersterPunkt.getX(), (int)ersterPunkt.getY(), laenge, breite, liniendicke);
        break;
      case 'l':
        figur = new Linie((int)ersterPunkt.getX(), (int)ersterPunkt.getY(), (int)zweiterPunkt.getX(), (int)zweiterPunkt.getY(), liniendicke);
        break;
      case 'k':
        figur = new Kreis((int)ersterPunkt.getX(), (int)ersterPunkt.getY(), breite, liniendicke);
        break;
      default:
        figur = new Rechteck((int)ersterPunkt.getX(), (int)ersterPunkt.getY(), laenge, breite, liniendicke);
        break;
    }
    display.hinzufuegen(figur);
  }
}
