package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.misc.v2.ColoredEllipse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColoredEllipseTest {

    @Test
    void testConstructorAndGetters() {
        Point center = new Point(10, 20);
        ColoredEllipse ellipse = new ColoredEllipse(center, 100, 50, 255);

        assertEquals(10, ellipse.getCenter().getX());
        assertEquals(20, ellipse.getCenter().getY());
        assertEquals(100, ellipse.getXAxis());
        assertEquals(50, ellipse.getYAxis());
        assertEquals(255, ellipse.getColor());
    }

    @Test
    void testConstructorWithCoordinates() {
        ColoredEllipse ellipse = new ColoredEllipse(10, 20, 100, 50, 255);

        assertEquals(10, ellipse.getCenter().getX());
        assertEquals(20, ellipse.getCenter().getY());
        assertEquals(100, ellipse.getXAxis());
        assertEquals(50, ellipse.getYAxis());
        assertEquals(255, ellipse.getColor());
    }

    @Test
    void testDefaultConstructor() {
        ColoredEllipse ellipse = new ColoredEllipse();

        assertEquals(0, ellipse.getCenter().getX());
        assertEquals(0, ellipse.getCenter().getY());
        assertEquals(1, ellipse.getXAxis());
        assertEquals(1, ellipse.getYAxis());
        assertEquals(0, ellipse.getColor());
    }

    @Test
    void testSetColor() {
        ColoredEllipse ellipse = new ColoredEllipse();
        ellipse.setColor(128);
        assertEquals(128, ellipse.getColor());

        ellipse.setColor(0);
        assertEquals(0, ellipse.getColor());
    }
}