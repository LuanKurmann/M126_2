package Grafikeditor1;

import java.io.FileNotFoundException;

public class Main {
    public static final Display display = new Display();
    private static final FigurSaver saver = new FigurSaver();
    private static final FigurLoader loader = new FigurLoader();


    public static void main(String[] args) throws FileNotFoundException {
        /*
        Rechteck rechteck = new Rechteck(200, 50, 300, 100, 1);
        Linie linie = new Linie(50,100,50,500,1);
        Kreis kreis = new Kreis(100,30,400,10);
        Ellipse ellipse = new Ellipse(200, 30, 22, 100,1);
        Figur figur = new Rechteck(100,20,100,50, 3);
*/


        //Geht nicht
        //Rechteck rechteck1 = new Figur(10,20,30);
/*
        display.hinzufuegen(rechteck);
        display.hinzufuegen(linie);
        display.hinzufuegen(kreis);
        display.hinzufuegen(ellipse);
        display.hinzufuegen(figur);

        rechteck.move(200, 200);
        linie.move(100, 100, 200, 200);
        kreis.move(50,50);
        ellipse.move(100, 300);

/*
        rechteck.groesseAendern(2);
        kreis.groesseAendern(2);
        ellipse.groesseAendern(2);
        linie.groesseAendern(2);
*/

/*
        saver.save(rechteck, rechteck.getClass());
        saver.save(ellipse, ellipse.getClass());
        saver.save(linie, linie.getClass());
        saver.save(kreis, kreis.getClass());
*/

        loader.load();

    }
}