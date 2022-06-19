package Practice_w3resource.com;

import java.util.Scanner;

public class СountChar2{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input any string:" + "\n");
            String st = scan.nextLine();
            System.out.println("The string is :" + st);

            System.out.println("The string length is :" + st.length());

            int letter = 0, space = 0, number = 0, other = 0;

            char[] c1 = st.toCharArray();

            for(int i = 0; i < st.length(); i++){
                if(Character.isLetter(c1[i])){
                    letter++;
                }
                else if(Character.isWhitespace(c1[i])){
                    space++;
                }
                else if (Character.isDigit(c1[i])){
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
