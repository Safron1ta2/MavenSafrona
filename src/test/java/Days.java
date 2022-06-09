import com.github.dockerjava.api.command.RestartContainerCmd;

import javax.xml.stream.events.StartElement;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("I love" + "Java");
        System.out.println("1-Понеділок, 2-Вівторок, 3-Середа, 4-Четвер, 5-П'ятниця, 6-Субота, 7-Неділя");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Ви обрали понеділок");
        }
        else if (day == 2) {
            System.out.println("Ви обрали вівторок");
        }
        else if (day == 3) {
            System.out.println("Ви обрали середу");
        }
        else if (day == 4) {
            System.out.println("Ви обрали четвер");
        }
        else if (day == 5) {
            System.out.println("Ви обрали п'ятницю");
        }
        else if (day == 6) {
            System.out.println("Ви обрали суботу");
        }
        else if (day == 7) {
            System.out.println("Ви обрали неділю");
        }
        else {
            System.out.println("Ви обрали невірний номер тижня!");
        }

    }
}
