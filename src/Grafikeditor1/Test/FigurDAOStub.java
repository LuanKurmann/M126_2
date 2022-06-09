package Grafikeditor1.Test;

import Grafikeditor1.FigurDAO;

public class FigurDAOStub implements FigurDAO {
    private final String[] testFiguren = {
            "Kreis;100;100;1;100",
            "Kreis;200;200;1;200"
    };
    private int currentFigur = 0;
    @Override
    public String[] readNextFigurData() {
        if(currentFigur < testFiguren.length) {
            String[] figurData = testFiguren[currentFigur].split(";");
            currentFigur++;
            return figurData;
        } else {
            return null;
        }
    }
}
