package Grafikeditor1;

import Grafikeditor1.Figures.Figur;
import Grafikeditor1.Figures.Kreis;
import Grafikeditor1.Figures.Linie;
import Grafikeditor1.Figures.Rechteck;

import java.util.ArrayList;
import java.util.List;

public class FigurParser {
  private FigurDAO dao;

  public FigurParser(FigurDAO dao) {
    this.dao = dao;
  }

  public List<Figur> parse() {
    List<Figur> figuren = new ArrayList<Figur>();
    String[] figurData = dao.readNextFigurData();
    while (figurData != null) {
      String figurTyp = figurData[0];
      int x = Integer.valueOf(figurData[1]);
      int y = Integer.valueOf(figurData[2]);
      int liniendicke = Integer.valueOf(figurData[3]);

      switch (figurTyp) {
      case "Rechteck":
        int breite = Integer.valueOf(figurData[4]);
        int hoehe = Integer.valueOf(figurData[5]);
        figuren.add(new Rechteck(x, y, breite, hoehe,liniendicke));
        break;
      case "Kreis":
        int radius = Integer.valueOf(figurData[4]);
        figuren.add(new Kreis(x, y, radius,liniendicke));
        break;
      case "Linie":
        int endx = Integer.valueOf(figurData[4]);
        int endy = Integer.valueOf(figurData[5]);
        figuren.add(new Linie(x, y, endx, endy,liniendicke));
        break;
      }
      figurData = dao.readNextFigurData();
    }
    return figuren;
  }
}
