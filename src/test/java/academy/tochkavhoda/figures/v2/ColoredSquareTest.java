package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.misc.v2.ColoredSquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColoredSquareTest {

    @Test
    void testConstructorAndGetters() {
        Point leftTop = new Point(10, 20);
        ColoredSquare square = new ColoredSquare(leftTop, 100, 255);

        assertEquals(10, square.getTopLeft().getX());
        assertEquals(20, square.getTopLeft().getY());
        assertEquals(100, square.getLength());
        assertEquals(255, square.getColor());
    }

    @Test
    void testConstructorWithCoordinates() {
        ColoredSquare square = new ColoredSquare(10, 20, 100, 255);

        assertEquals(10, square.getTopLeft().getX());
        assertEquals(20, square.getTopLeft().getY());
        assertEquals(100, square.getLength());
        assertEquals(255, square.getColor());
    }

    @Test
    void testDefaultConstructor() {
        ColoredSquare square = new ColoredSquare();

        assertEquals(0, square.getTopLeft().getX());
        assertEquals(-1, square.getTopLeft().getY());
        assertEquals(1, square.getLength());
        assertEquals(0, square.getColor());
    }

    @Test
    void testSetColor() {
        ColoredSquare square = new ColoredSquare();
        square.setColor(128);
        assertEquals(128, square.getColor());
    }
}