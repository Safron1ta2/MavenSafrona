package Practice_w3resource.com;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(celsius);
    }
}