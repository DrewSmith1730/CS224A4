// jdh CS224 Spring 2023

import java.util.Random;

public class Main {
    static Random rand = new Random();

    //-------------------------------------------------

    public static void main(String args[]) {
        testOne();
        testTwo();
    }

    //-------------------------------------------------

    public static void testOne() {
        int i;
        Point p;

        PointCollection pc = new PointCollection();

        for (i=0; i<50; ++i) {
            p = new Point((double) i, (double) i);
            pc.addPoint(p);
            System.out.println(p.x + "," + p.y);
        }

        double xstar = 34.0;

        for (i=0; i<20; ++i) {
            double r = rand.nextDouble();
            p = new Point(xstar + r/100.0, (double) 2*i);
            pc.addPoint(p);
            System.out.println(p.x + "," + p.y);
        }

        PointPair closestPair_rec = pc.closestPair();
        PointPair closestPair_bf = pc.bruteForce();
        System.out.println("closest pair from D&T: " + closestPair_rec);
        System.out.println("closest pair from BF:  " + closestPair_bf);
    } // testOne()

    //-------------------------------------------------

    public static void testTwo() {
        Point p;
        int i, j;
        double x, y, delta, xStart, yStart, xDelta, yDelta;

        PointCollection pc = new PointCollection();

        xStart = 1.0;
        yStart = 1.0;
        xDelta = 0.50;
        yDelta = 0.75;
        delta = 0.25;

        x = xStart;
        for (i=0; i<25; ++i) {
            y = yStart;
            for (j=0; j<4; ++j) {
                p = new Point(x, y);
                System.out.println(p);
                pc.addPoint(p);
                x = x + xDelta;
                y = y + yDelta;
                yDelta = yDelta + delta;
            }
            xDelta = xDelta + delta;
        }

        PointPair closestPair_rec = pc.closestPair();
        PointPair closestPair_bf = pc.bruteForce();
        System.out.println("closest pair from D&T: " + closestPair_rec);
        System.out.println("closest pair from BF:  " + closestPair_bf);
    } // testTwo()

    //----------------------------------------------------

    public static void testThree() {
        Point p;
        int i, j;

        PointCollection pc = new PointCollection();

        p = new Point(-5, 5);
        pc.addPoint(p);
        p = new Point(-4.1, 4.1);
        pc.addPoint(p);
        p = new Point(-3.3, 3.3);
        pc.addPoint(p);
        p = new Point(-2.5, 2.5);
        pc.addPoint(p);
        p = new Point(-1.7, 1.7);
        pc.addPoint(p);
        p = new Point(-0.9, 0.9);
        pc.addPoint(p);

        PointPair closestPair_rec = pc.closestPair();
        PointPair closestPair_bf = pc.bruteForce();
        System.out.println("closest pair from D&T: " + closestPair_rec);
        System.out.println("closest pair from BF:  " + closestPair_bf);
    } // testThree()

    //-------------------------------------------------

    public static void testFour() {
        Point p;
        int i, j;
        double x, y, delta, xStart, yStart, xDelta, yDelta, sign;

        PointCollection pc = new PointCollection();

        xStart = -2.0;
        yStart = 0.0;
        xDelta = 0.125;
        yDelta = 0.0625;
        delta = 1.0 / 32;

        x = xStart;
        for (i=0; i<20; ++i) {
            y = yStart;
            for (j=0; j<25; ++j) {
                p = new Point(x, y);
                System.out.println(p);
                pc.addPoint(p);
                y = y + yDelta;
                yDelta = yDelta + delta;
            }
            System.out.println("yDelta = " + yDelta);
            x = x + xDelta;
            xDelta = xDelta + delta;
            System.out.println("xDelta = " + xDelta);
        }

        p = new Point(1.95, 1.95);
        pc.addPoint(p);
        p = new Point(1.9501, 1.9501);
        pc.addPoint(p);

        PointPair closestPair_rec = pc.closestPair();
        PointPair closestPair_bf = pc.bruteForce();
        System.out.println("closest pair from D&T: " + closestPair_rec);
        System.out.println("closest pair from BF:  " + closestPair_bf);
    } // testFour()
}

