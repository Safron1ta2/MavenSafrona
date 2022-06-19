package Practice_w3resource.com;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any string:" + "\n");
        String st = scan.nextLine();
        System.out.println("The string is :" + st);

        System.out.println("The string length is :" + st.length());

        int letter = 0, space = 0, number = 0, other = 0;

        char c1;

        for(int i = 0; i < st.length(); i++){
            c1 = st.charAt(i);
            if(Character.isLetter(c1)){
                letter++;
            }
            else if(Character.isWhitespace(c1)){
                space++;
            } else if (Character.isDigit(c1)){
                number++;
            }
            else
                other++;
        }
        System.out.println("letter:" + letter);
        System.out.println("space:" + space);
        System.out.println("number:" + number);
        System.out.println("other:" + other);
    }
}
