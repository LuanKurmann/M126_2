package Grafikeditor1;

import java.io.*;

import static java.lang.Integer.parseInt;

public class FigurLoader {
    private String path = "C:\\Users\\luan\\OneDrive\\Gibb\\2Lehrjahr\\4Semester\\iet-226_2\\M126_2\\src\\Grafikeditor1\\save.txt";

    public void load() {
        String line = "";
        String splitBy = ";";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] figur = line.split(splitBy);
                /*
                switch (figur[0]) {
                    case "Rechteck":
                        Main.display.hinzufuegen(new Rechteck(parseInt(figur[1]), parseInt(figur[2]), parseInt(figur[3]), parseInt(figur[4]), parseInt(figur[5])));
                        break;
                    case "Kreis":
                        Main.display.hinzufuegen(new Kreis(parseInt(figur[1]), parseInt(figur[2]), parseInt(figur[3]), parseInt(figur[4])));
                        break;
                    case "Linie":
                        Main.display.hinzufuegen(new Linie(parseInt(figur[1]), parseInt(figur[2]), parseInt(figur[3]), parseInt(figur[4]), parseInt(figur[5])));
                        break;
                    case "Ellipse":
                        Main.display.hinzufuegen(new Ellipse(parseInt(figur[1]), parseInt(figur[2]), parseInt(figur[3]), parseInt(figur[4]), parseInt(figur[5])));
                        break;
                }
                */


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

