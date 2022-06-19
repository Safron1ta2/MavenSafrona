package Practice_w3resource.com;

import java.util.Scanner;

public class Earth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First latitude: ");
        double x1 = scanner.nextDouble();
        System.out.println("First longitude: ");
        double y1 = scanner.nextDouble();
        System.out.println("Second latitude: ");
        double x2 = scanner.nextDouble();
        System.out.println("Second longitude: ");
        double y2 = scanner.nextDouble();
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double r = 6371.01;
        double distance = r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
        System.out.println(distance);
    }
}
