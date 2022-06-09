package Grafikeditor1;

import Grafikeditor1.Figures.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Display display = new Display();

    public static void main(String[] args) {

        FigurFileDAO dao = new FigurFileDAO();
        FigurParser fp = new FigurParser(dao);
        List<Figur> figuren = fp.parse();
        System.out.println(figuren.toString());
        ArrayList<Figur> figurList = new ArrayList<>();

        figurList.addAll(figuren);
        Zeichnung zeichnung = new Zeichnung(figurList);

        display.setZeichnung(zeichnung);

        display.repaint();
        dao.close();
    }
}
