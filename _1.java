public class _1  {

    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0;
        double x2 = 3.0, y2 = 4.0;

        double centerX = 5.0, centerY = -0.55;
        double radius = 3.0;

        double distanceA1 = distance(x1, y1, centerX, centerY);
        double distanceA2 = distance(x2, y2, centerX, centerY);

        System.out.println("Расстояние между точкой A1 и центром окружности: " + distanceA1);
        System.out.println("Расстояние между точкой A2 и центром окружности: " + distanceA2);

        if (distanceA1 < distanceA2) {
            System.out.println("Точка A1 ближе к центру окружности.");
        } else if (distanceA2 < distanceA1) {
            System.out.println("Точка A2 ближе к центру окружности.");
        } else {
            System.out.println("Точки A1 и A2 находятся на одинаковом расстоянии от центра окружности.");
        }

        System.out.println("Точка A1 " + (isOnCircle(x1, y1, centerX, centerY, radius) ? "принадлежит" : "не принадлежит") + " окружности.");
        System.out.println("Точка A2 " + (isOnCircle(x2, y2, centerX, centerY, radius) ? "принадлежит" : "не принадлежит") + " окружности.");
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static boolean isOnCircle(double x, double y, double centerX, double centerY, double radius) {
        double distance = distance(x, y, centerX, centerY);
        return Math.abs(distance - radius) < 1e-6;
    }
}