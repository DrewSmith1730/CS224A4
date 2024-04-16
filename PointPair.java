// jdh Spring 2023 CS224

public class PointPair {
    Point p1, p2;

    public PointPair(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        String s = "{ " + this.p1.toString() + ", " + this.p2.toString() + " }";
        return s;
    }
}
