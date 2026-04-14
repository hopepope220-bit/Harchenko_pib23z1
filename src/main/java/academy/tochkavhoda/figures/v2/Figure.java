package academy.tochkavhoda.figures.v2;

import academy.tochkavhoda.iface.v2.HasArea;
import academy.tochkavhoda.iface.v2.Movable;
import academy.tochkavhoda.iface.v2.Resizable;
import academy.tochkavhoda.figures.v2.Point;

public abstract class Figure implements HasArea, Movable, Resizable {

    public abstract boolean isInside(int x, int y);

    public boolean isInside(Point point) {
        return this.isInside(point.getX(), point.getY());
    }

    public abstract double getPerimeter();
}

