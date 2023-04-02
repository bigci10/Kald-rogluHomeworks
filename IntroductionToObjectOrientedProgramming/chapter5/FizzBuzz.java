package IntroductionToObjectOrientedProgramming.chapter5;

import java.util.Scanner;

public class FizzBuzz {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gameText;
        for(int i = 1; i <= 100; i++){
            System.out.println("Number is : " + i);

            if ((i % 3 == 0) && (i % 5 == 0)) {

                System.out.println("PLEASE ENTER : \n (1) FIZZ \n (2) BUZZ \n (3)FIZZBUZZ");
                gameText = sc.nextInt();

                if (gameText == 3) {
                    System.out.println("Correct ! FIZZBUZZ");

                } else if (gameText == 1 || gameText == 2) {
                    System.out.println("FALSE !!");

                } else if (gameText == 4) {
                    break;

                } else
                    System.out.println("Please choose 1 between 3");


            } else if (i % 3 == 0) {

                System.out.println("PLEASE ENTER : \n (1) FIZZ \n (2) BUZZ \n (3)FIZZBUZZ \n (4)Exit");
                gameText = sc.nextInt();
                if (gameText == 1) {
                    System.out.println("Correct ! FIZZ");

                } else if (gameText == 2 || gameText == 3) {
                    System.out.println("False !!");

                } else if (gameText == 4) {
                    break;

                } else
                    System.out.println("Please choose 1 or 2 or 3..");


            } else if(i % 5 == 0) {
                System.out.println("PLEASE ENTER : \n (1) FIZZ \n (2) BUZZ \n (3)FIZZBUZZ \n (4) Exit");
                gameText = sc.nextInt();

                if(gameText == 2) {
                    System.out.println("Correct ! BUZZ");

                } else if (gameText == 1) {
                    System.out.println("False !!");

                } else if (gameText == 4) {
                    break;

                } else {
                    System.out.println("Please choose 1 or 2..");
                }

            }
        }

    }

}
