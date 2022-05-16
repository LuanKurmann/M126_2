package Grafikeditor1;

import Grafikeditor1.Figures.*;

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

  public  int pitagor (int x , int y){
    int c = (int)Math.sqrt((x*x)+(y*y));
    return c;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    Figur figur = null;
    int liniendicke = 1;
    int x = 0;
    int y = 0;

    int breite = (int)(zweiterPunkt.getX() - ersterPunkt.getX());
    int laenge = (int)(zweiterPunkt.getY()- ersterPunkt.getY());

    int radius = pitagor(breite, laenge);
    int durchmesser = radius*2;

    x = (int) ersterPunkt.getX();
    y = (int) ersterPunkt.getY();

    if (breite <= 0){
      breite = breite * -1 ;
      x = (int) zweiterPunkt.getX();
    }
    if (laenge <= 0){
      laenge = laenge * -1 ;
      y = (int) zweiterPunkt.getY();
    }



    figur = switch (figurTyp) {
      case 'l' -> new Linie((int) ersterPunkt.getX(), (int) ersterPunkt.getY(), (int) zweiterPunkt.getX(), (int) zweiterPunkt.getY(), liniendicke);
      case 'k' -> new Kreis(x - radius, y - radius, durchmesser, liniendicke);
      case 'e' -> new Ellipse(x, y, breite, laenge, liniendicke);
      case 's' -> new Schneemann(x, y, breite / 2, liniendicke);
      case 'm' -> new Schild(x, y, breite, laenge, liniendicke);
      case 'f' -> new SchneemannFamillie(x, y, liniendicke, breite);
      default -> new Rechteck(x, y, laenge, breite, liniendicke);
    };
    display.hinzufuegen(figur);
  }
}
