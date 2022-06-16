package Practice_w3resource.com;
import java.util.Scanner;

public class МultiplicationРlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        int number = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
         r = number * i;
            System.out.println(number + " x " + i + " = " + r);
        }
    }
}
