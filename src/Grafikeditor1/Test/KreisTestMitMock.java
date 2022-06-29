package Grafikeditor1.Test;

import Grafikeditor1.Figures.Kreis;
import org.junit.Test;

import java.awt.*;

import static org.mockito.Mockito.*;

public class KreisTestMitMock {
    private Graphics g = mock(Graphics.class);

    @Test
    public void testZeichne() {
        Kreis k = new Kreis(10, 10, 20, 1);
        k.zeichne(g);
        verify(g, times(1)).drawOval(10,10,20,20);
    }
}
