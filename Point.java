// jdh Spring 2023 CS224

public class Point {
    double x;
    double y;
    int xpos;
    int ypos;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        xpos = -1;
        ypos = -1;
    }

    public String toString() {
        String s = "(" + this.x + ", " + this.y + ") xpos=" + this.xpos + " ypos=" + this.ypos;
        return s;
    }

    public int compareX(Object o) {
        Point otherPoint = (Point) o;
        if (this.x < otherPoint.x)
            return -1;
        else if (this.x > otherPoint.x)
            return 1;
        else
            return 0;
    }

    public int compareY(Object o) {
        Point otherPoint = (Point) o;
        if (this.y < otherPoint.y)
            return -1;
        else if (this.y > otherPoint.y)
            return 1;
        else
            return 0;
    }

    double distanceTo(Point otherPoint) {
        double dx = (this.x - otherPoint.x);
        double dy = (this.y - otherPoint.y);
        return Math.sqrt(dx*dx + dy*dy);
    }
}

