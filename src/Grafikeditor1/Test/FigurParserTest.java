package Grafikeditor1.Test;
import Grafikeditor1.FigurDAO;
import Grafikeditor1.FigurParser;
import Grafikeditor1.Figures.Figur;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class FigurParserTest {
    private FigurDAO dao;
    private FigurParser fp;

    @Before
    public void setup(){
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
    }

    @Test
    public void test(){
        List<Figur> figuren = fp.parse();
        assertEquals(2,figuren.size());
        assertEquals(100, figuren.get(0).getX());
        assertEquals(100, figuren.get(0).getY());
        assertEquals(1, figuren.get(0).getLiniendicke());

        assertEquals(figuren.get(0).toString(),"Kreis: Radius-X: 100 Radius-Y: 100");
        assertEquals(figuren.get(1).toString(),"Kreis: Radius-X: 200 Radius-Y: 200");

    }
}
