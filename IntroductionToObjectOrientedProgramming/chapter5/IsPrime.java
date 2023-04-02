package IntroductionToObjectOrientedProgramming.chapter5;

public class IsPrime {

    public static boolean findPrime(int number) {

        if(number <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeRange(int start, int end) {

        if (end <= start)
            System.out.println("Your range is wrong !");

        for(int i = start; i < end; i++)
        {
            if (findPrime(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        boolean isPrime = IsPrime.findPrime(7);
        System.out.println(isPrime);
        primeRange(1,100);
    }
}
