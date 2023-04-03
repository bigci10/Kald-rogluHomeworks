package IntroductionToObjectOrientedProgramming.chapter6;

import java.util.Collection;

public class DistinctArray {


    public static void main(String[] args) {


        int[] array1 = {3, 3, 87, 56, 1, 87, 3, 2};

        int[] distinctArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (array1[i] == array1[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctArray[i] = array1[i];
            }
        }

        for (Integer i : distinctArray) {
            System.out.println(i);
        }

    }
}


