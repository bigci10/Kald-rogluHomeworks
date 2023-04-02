package IntroductionToObjectOrientedProgramming.chapter5;

import java.util.Scanner;

public class AddStarsToString {

     static void main(String[] args) {

        main("Bilal",1);

    }

    public static void main(String text,int d)
    {
        for(int i = 0; i <= text.length()-1 ; i++)
        {
            if(i != text.length() - 1)
            {
                System.out.print(text.charAt(i));
                System.out.print("*");
            }
            else
                System.out.print(text.charAt(i));
        }
    }
}
