package IntroductionToObjectOrientedProgramming.chapter5;


import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String num = String.valueOf(number);

        for(int i = (num.length() - 1); i >= 0 ; i--)
        {
            System.out.print(num.charAt(i));
        }
    }

}
