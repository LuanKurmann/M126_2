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



    switch (figurTyp) {
      case 'r':
        figur = new Rechteck(x, y, laenge, breite, liniendicke);
        break;
      case 'l':
        figur = new Linie((int)ersterPunkt.getX(),(int)ersterPunkt.getY(), (int)zweiterPunkt.getX(), (int)zweiterPunkt.getY(), liniendicke);
        break;
      case 'k':
        figur = new Kreis(x, y, breite, liniendicke);
        break;
      case 's':
        figur = new Schneemann(x, y, breite / 2, liniendicke);
        break;
      case 'm':
        figur = new Schild(x, y, breite, laenge, liniendicke);
        break;
      case 'f':
        figur = new SchneemannFamillie(x, y, liniendicke, breite);
        break;
      default:
        figur = new Rechteck(x, y, laenge, breite, liniendicke);
        break;
    }
    display.hinzufuegen(figur);
  }
}
