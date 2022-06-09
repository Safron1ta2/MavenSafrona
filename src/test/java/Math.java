import org.testng.Assert;
import org.testng.annotations.Test;

public class Math {

    public int summ (int a, int b){
        return a + b;
    }
    public int mult (int a, int b){
        return a * b;
    }

    @Test
    public void testSumm(){

        Assert.assertTrue(summ(5, 10) == 15);
        Assert.assertTrue(summ(10, 10) == 20);
        Assert.assertTrue(summ(0, 10) == 10);

    }

    @Test
    public void testMult(){
        Assert.assertTrue(mult(6, 6) == 36);
        Assert.assertTrue(mult(5, 5) == 25);
        Assert.assertTrue(mult(10, 10) == 100);
    }


}
