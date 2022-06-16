package Practice_w3resource.com;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] number = {1, 3, 4};
        int sum = 0;
        Arrays.sort(number, 0, 2);
        System.out.println(number[0] + number[1] + number[2]);  //my
        System.out.println(Arrays.stream(number).sum()); //my
        for (int i : number){  //fromWeb
           sum += i;
        }
        System.out.println(sum);
    }
}
