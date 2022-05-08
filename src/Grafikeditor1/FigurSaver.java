/*
package Grafikeditor1;

import Grafikeditor1.Figurs.*;

import java.io.*;
import java.io.BufferedWriter;

public class FigurSaver {
    private String path = "C:\\Users\\luan\\OneDrive\\Gibb\\2Lehrjahr\\4Semester\\iet-226_2\\M126_2\\src\\Grafikeditor1\\save.txt";
    public void save(Figur figur, Class klasse) {

        try {
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("Datei: " + myObj.getName() + " erstellt!");
            } else {
                System.out.println("Datei gibt es schon!");
            }

            try {

                FileWriter fileWriter = new FileWriter(path, true);
                BufferedWriter writer = new BufferedWriter(fileWriter);

                if (Rechteck.class.equals(klasse)) {
                    writer.write("Rechteck" + ";" + figur.x + ";" + figur.y + ";" + figur.liniendicke + ";" + ((Rechteck) figur).getLaenge() + ";" + ((Rechteck) figur).getBreite() + "\n");
                } else if (Kreis.class.equals(klasse)) {
                    writer.write("Kreis" + ";" + figur.x + ";" + figur.y + ";" + figur.liniendicke + ";" + ((Kreis) figur).getRadius() + "\n");
                } else if (Linie.class.equals(klasse)) {
                    writer.write("Linie" + ";" + figur.x + ";" + figur.y + ";" + figur.liniendicke + ";" + ((Linie) figur).getxEndPos() + ";" + ((Linie) figur).getyEndPos() + "\n");
                } else if (Ellipse.class.equals(klasse)) {
                    writer.write("Ellipse" + ";" + figur.x + ";" + figur.y + ";" + figur.liniendicke + ";" + ((Ellipse) figur).getRadiusX() + ";" + ((Ellipse) figur).getRadiusY() + "\n");
                }

                writer.close();
                fileWriter.close();
                System.out.println("Figur erfolgreich in die Datei geschrieben");
            }
            catch (IOException e) {
                System.out.println("Error beim Schreiben in die Datei!");
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Error beim Erstellen der Datei!");
            e.printStackTrace();
        }
    }
}*/
