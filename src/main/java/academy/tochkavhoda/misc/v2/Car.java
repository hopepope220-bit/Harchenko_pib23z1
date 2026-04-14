package academy.tochkavhoda.misc.v2;

import academy.tochkavhoda.iface.v2.Colored;
import academy.tochkavhoda.iface.v2.Movable;
import academy.tochkavhoda.iface.v2.HasArea;
import academy.tochkavhoda.figures.v1.Point;

public class Car implements Colored, Movable, HasArea {

    private Point position;
    private int width;
    private int height;
    private int color;

    public Car(Point position, int width, int height, int color) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.position = new Point(position.getX(), position.getY());
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Car(int x, int y, int width, int height, int color) {
        this(new Point(x, y), width, height, color);
    }

    public Car(int width, int height, int color) {
        this(new Point(0, 0), width, height, color);
    }

    public Car(Point position, int width, int height) {
        this(position, width, height, 0);
    }

    public Car(int width, int height) {
        this(new Point(0, 0), width, height, 0);
    }

    public Car() {
        this(new Point(0, 0), 1, 1, 0);
    }

    public Point getPosition() {
        return new Point(position.getX(), position.getY());
    }

    public void setPosition(Point position) {
        this.position = new Point(position.getX(), position.getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void moveTo(int x, int y) {
        this.position = new Point(x, y);
    }

    @Override
    public void moveRel(int dx, int dy) {
        this.position = new Point(position.getX() + dx, position.getY() + dy);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isInside(int x, int y) {
        return x >= position.getX() && x <= position.getX() + width &&
                y >= position.getY() && y <= position.getY() + height;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public void resize(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Ratio must be positive");
        }
        this.width = (int)(width * ratio);
        this.height = (int)(height * ratio);

        // Гарантируем минимальный размер
        if (this.width <= 0) this.width = 1;
        if (this.height <= 0) this.height = 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return width == car.width &&
                height == car.height &&
                color == car.color &&
                position.equals(car.position);
    }

    @Override
    public int hashCode() {
        return 31 * position.hashCode() + 17 * width + 13 * height + color;
    }
}