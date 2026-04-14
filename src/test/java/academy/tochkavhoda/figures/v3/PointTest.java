package academy.tochkavhoda.figures.v3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    public void testConstructorWithParameters() {
        Point point = new Point(5, 10);
        assertEquals(5, point.getX());
        assertEquals(10, point.getY());
    }

    @Test
    public void testDefaultConstructor() {
        Point point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    public void testSetX() {
        Point point = new Point(0, 0);
        point.setX(15);
        assertEquals(15, point.getX());
    }

    @Test
    public void testSetY() {
        Point point = new Point(0, 0);
        point.setY(20);
        assertEquals(20, point.getY());
    }

    @Test
    public void testMoveTo() {
        Point point = new Point(3, 4);
        point.moveTo(10, 20);
        assertEquals(10, point.getX());
        assertEquals(20, point.getY());
    }

    @Test
    public void testMoveRel() {
        Point point = new Point(5, 7);
        point.moveRel(3, -2);
        assertEquals(8, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    public void testEqualsNull() {
        Point point = new Point(1, 2);
        assertFalse(point.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Point point = new Point(1, 2);
        String notPoint = "not a point";
        assertFalse(point.equals(notPoint));
    }

    @Test
    public void testEqualsIdenticalPoints() {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(3, 5);
        assertTrue(point1.equals(point2));
    }

    @Test
    public void testEqualsDifferentX() {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(4, 5);
        assertFalse(point1.equals(point2));
    }

    @Test
    public void testMoveRelWithNegativeValues() {
        Point point = new Point(10, 10);
        point.moveRel(-3, -5);
        assertEquals(7, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    public void testMoveRelWithZero() {
        Point point = new Point(5, 5);
        point.moveRel(0, 0);
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    public void testMoveToSameCoordinates() {
        Point point = new Point(5, 5);
        point.moveTo(5, 5);
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    public void testChainOfOperations() {
        Point point = new Point(0, 0);
        point.moveTo(10, 10);
        point.moveRel(-5, 5);
        point.setX(20);
        point.setY(30);

        assertEquals(20, point.getX());
        assertEquals(30, point.getY());
    }

}