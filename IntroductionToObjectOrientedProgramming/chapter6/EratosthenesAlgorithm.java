package IntroductionToObjectOrientedProgramming.chapter6;

import java.util.Arrays;

public class EratosthenesAlgorithm {
    public static void main(String[] args) {
        int n = 50; // burada 50 yerine istediğiniz sayıyı yazabilirsiniz

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //System.out.println("1"); // 1 bir asal sayı değildir, ancak Sieve of Eratosthenes algoritması bu sayıyı asal olarak işaretler. Bu nedenle, 1'in asal sayı olarak kabul edilmemesi için ayrıca yazdırılır.

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}