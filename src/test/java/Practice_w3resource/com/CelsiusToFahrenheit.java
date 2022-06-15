package Practice_w3resource.com;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        boolean b = false;
        Scanner scanner = new Scanner(System.in);
        while (!b){
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius*1.8)+32;
            System.out.println(fahrenheit);
        }
    }
}
