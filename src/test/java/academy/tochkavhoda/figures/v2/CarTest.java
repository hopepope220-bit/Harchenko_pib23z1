package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.misc.v2.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testConstructorAndGetters() {
        Car car = new Car(10, 20, 100, 50, 255);

        assertEquals(10, car.getPosition().getX());
        assertEquals(20, car.getPosition().getY());
        assertEquals(100, car.getWidth());
        assertEquals(50, car.getHeight());
        assertEquals(255, car.getColor());
    }

    @Test
    void testDefaultConstructor() {
        Car car = new Car();

        assertEquals(0, car.getPosition().getX());
        assertEquals(0, car.getPosition().getY());
        assertEquals(1, car.getWidth());
        assertEquals(1, car.getHeight());
        assertEquals(0, car.getColor());
    }

    @Test
    void testMoveToAndMoveRel() {
        Car car = new Car(10, 20, 100, 50, 255);

        car.moveTo(50, 60);
        assertEquals(50, car.getPosition().getX());
        assertEquals(60, car.getPosition().getY());

        car.moveRel(10, -20);
        assertEquals(60, car.getPosition().getX());
        assertEquals(40, car.getPosition().getY());
    }

    @Test
    void testGetAreaAndGetPerimeter() {
        Car car = new Car(100, 50);

        assertEquals(5000.0, car.getArea(), 0.001);
        assertEquals(300.0, car.getPerimeter(), 0.001);
    }
}