import org.testng.annotations.Test;

import java.util.Arrays;

public class Massif {
    @Test
    public void numbers(){
        int[] myNumbers = {7,1,3,10,5,9,15};
        Arrays.sort(myNumbers,0,7);
        System.out.println(Arrays.toString(myNumbers));
        System.out.println(myNumbers[myNumbers.length-1]);
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers.length);
    }

    @Test
    public void massifString(){
        String[] names = {"Safron", "neSafron", "Safronu", "neSafronu"};
        System.out.println(Arrays.toString(names));
    }

}
