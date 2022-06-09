import org.testng.annotations.Test;

import java.util.Arrays;

public class Users {

    @Test
    public void arrayLesson() {
       int[] numbers = {5, 8, 19, 0, 6, 11};
        Arrays.sort(numbers, 0,6);

        System.out.println(numbers[numbers.length-1]);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 19));
    }
}
