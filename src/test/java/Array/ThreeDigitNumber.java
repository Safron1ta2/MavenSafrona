package Array;

import Practice_w3resource.com.Array;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ThreeDigitNumber {
    public static void main(String[] Safronchik) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int amount = 0;
            for(int i:array) {
                for (int j:array) {
                    for (int k:array) {
                        if(k != i && k != j && i != j){
                            System.out.println(i + "" + j + "" + k);
                            amount++;
                        }
                    }
                }
            }
        System.out.println(amount);
    }
    @Test
    public void f(){
        String[] myString = new String[]{"раз", "два", "три", "четыре", "пять"};
        int n = (int)Math.floor(Math.random() * myString.length);
        System.out.println(myString[n]);
    }
}
