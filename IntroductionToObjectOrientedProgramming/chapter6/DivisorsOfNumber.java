package IntroductionToObjectOrientedProgramming.chapter6;

import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int number = scanner.nextInt();

        System.out.printf("%d sayısının bölenleri: ", number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }
}
