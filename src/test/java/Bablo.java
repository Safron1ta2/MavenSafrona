import org.testng.annotations.Test;

public class Bablo {

    int stavka = 1700;
    int nadbavka = 400;
    int shtraf = 150;
    double nds = 0.2;

    public double zarplataSafrona(){

        return stavka-(stavka*nds)+nadbavka;

    }

    public double zarplataSafronitu(){

        return stavka-(stavka*nds)-shtraf;

    }

    @Test
    public void rozrahunkovi() {
    zarplataSafrona();
    zarplataSafronitu();
        System.out.println(zarplataSafrona()+zarplataSafronitu());
    }
}
