package Array;

import Practice_w3resource.com.Array;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ThreeDigitNumber {
    public static void main(String[] Safronchik) {
        int[] array = {1, 2, 3, 4};
        Arrays.sort(array);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int random1 = (int) Math.floor(Math.random() * array.length);

                for (int l = 0; l < array.length - 1; l++) {
                    int random2 = (int) Math.floor(Math.random() * array.length);

                    for (int o = 0; o < array.length - 1; o++) {
                        int random3 = (int) Math.floor(Math.random() * array.length);
                        char c1 = Character.forDigit(random1, 10);
                        System.out.println(c1);
                        char c2 = Character.forDigit(random2, 10);
                        char c3 = Character.forDigit(random3, 10);
                            System.out.println(c1+c2+c3);
                    }

                }
            }
        }
    }
    @Test
    public void f(){
        String[] myString = new String[]{"раз", "два", "три", "четыре", "пять"};
        int n = (int)Math.floor(Math.random() * myString.length);
        System.out.println(myString[n]);
    }
}
