package Array;

import java.util.Arrays;

public class Sorting {
        static void sort(int [] array1){
            int min = array1[0];
            for (int i = 1; i < array1.length ; i++) {
                if(array1[i] < min){
                    min = array1[i];

                }
            }
            System.out.println(min);
        }

        public static void main(String[] args) {
            int[] array1 = new int[]{4, 2, -4, 7, -2};


            //System.out.println(Arrays.toString(array1));
        }

}
