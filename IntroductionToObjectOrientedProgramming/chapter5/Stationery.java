package IntroductionToObjectOrientedProgramming.chapter5;

public class Stationery {
    public static int fiyatHesapla(int n) {
        if (n <= 0) {
            return 0;
        } else if (n >= 25) {
            return fiyatHesapla(n % 25) + 100;
        } else if (n >= 12) {
            return fiyatHesapla(n % 12) + 50;
        } else {
            return fiyatHesapla(n % 1) + 5;
        }
    }

    public static void main(String[] args) {

        System.out.println(Stationery.fiyatHesapla(5));
    }
}
