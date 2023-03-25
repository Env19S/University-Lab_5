package org.example;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.List;

public class PointInPolygonTask5 {

    public static void main(String[] args) {
        List<Point2D> polygon1 = Arrays.asList(
                new Point2D.Double(1, -3),
                new Point2D.Double(2, 0),
                new Point2D.Double(1, 5),
                new Point2D.Double(-1, 5),
                new Point2D.Double(-1, 3),
                new Point2D.Double(-3, 1),
                new Point2D.Double(-1, -1)
        );

        List<Point2D> polygon2 = Arrays.asList(
                new Point2D.Double(7, -3),
                new Point2D.Double(5, -2),
                new Point2D.Double(4, -3),
                new Point2D.Double(2, -1),
                new Point2D.Double(4, -2),
                new Point2D.Double(3, 0),
                new Point2D.Double(4, 1),
                new Point2D.Double(6, -1)
        );

        Point2D testPoint = new Point2D.Double(1, 1);

        if (isPointInPolygon(testPoint, polygon1)) {
            System.out.println("Точка принадлежит фигуре 1");
        } else if (isPointInPolygon(testPoint, polygon2)) {
            System.out.println("Точка принадлежит фигуре 2");
        } else {
            System.out.println("Точка не принадлежит ни одной из фигур");
        }
    }

    private static boolean isPointInPolygon(Point2D point, List<Point2D> polygon) {
        boolean result = false;
        int j = polygon.size() - 1;
        for (int i = 0; i < polygon.size(); i++) {
            if ((polygon.get(i).getY() > point.getY()) != (polygon.get(j).getY() > point.getY()) &&
                    (point.getX() < (polygon.get(j).getX() - polygon.get(i).getX()) * (point.getY() - polygon.get(i).getY()) / (polygon.get(j).getY() - polygon.get(i).getY()) + polygon.get(i).getX())) {
                result = !result;
            }
            j = i;
        }
        return result;
    }
}
