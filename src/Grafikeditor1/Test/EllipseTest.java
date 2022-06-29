package Grafikeditor1.Test;

import Grafikeditor1.Figures.Ellipse;
import Grafikeditor1.Figures.Kreis;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static groovy.test.GroovyTestCase.assertEquals;

public class EllipseTest {
    GraphicsStub g = new GraphicsStub();

    @Test
    public void testZeichne() {
        Kreis k = new Kreis(10, 10, 20,1);
        k.zeichne(g);

        assertEquals(1, g.nbOfDrawOvalCalls);
        assertEquals(10, g.x);
        assertEquals(10, g.y);
        assertEquals(20, g.width);
        assertEquals(20, g.height);
    }
}
