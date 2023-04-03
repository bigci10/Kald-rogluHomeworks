package IntroductionToObjectOrientedProgramming.chapter6;

import java.util.Scanner;

public class PrimeDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int number = scanner.nextInt();

        System.out.printf("%d sayısının asal bölenleri: ", number);
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}