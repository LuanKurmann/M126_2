package Grafikeditor1;

import Grafikeditor1.Figures.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Display display = new Display();
    //private static final FigurSaver saver = new FigurSaver();
    //private static final FigurLoader loader = new FigurLoader();


    public static void main(String[] args) throws FileNotFoundException {

        FigurFileDAO dao = new FigurFileDAO();
        FigurParser fp = new FigurParser(dao);
        List<Figur> figuren = fp.parse();
        ArrayList<Figur> figurList = new ArrayList<>();

        for (Figur f:figuren) {
            figurList.add(f);
        }
        Zeichnung zeichnung = new Zeichnung(figurList);

        display.setZeichnung(zeichnung);

        display.repaint();
        dao.close();


    }
}
