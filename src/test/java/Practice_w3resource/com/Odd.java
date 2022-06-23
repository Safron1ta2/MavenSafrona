package Practice_w3resource.com;

import org.testng.annotations.Test;

public class Odd {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    @Test
    public void odd(){
        int j = 1;
        while (j < 100){
            if(j % 2==0){
                System.out.println(j);
            }
            j++;
        }
    }
    @Test
    public void oddDo(){
        int j = 0;
        do {
            j++;
            if(j % 2 == 1){
                System.out.println(j);
            }
        }
        while (j < 99);
        }
}
