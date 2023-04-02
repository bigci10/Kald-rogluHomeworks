package IntroductionToObjectOrientedProgramming.chapter5;

public class Bottles {


    //static bir metodumuz object stuff , her türlü nesneyi kabul etmek için kullanılır çünkü her nesne objectten türer.
    // int n tekrar sayısı
    static void printSong(Object stuff, int n)
    {
        //başlangıç için string ternary operator kullanılarak ayarlanır
        String plural = (n == 1) ? "" : "s"; //buradaki amaç çoğul olduğu müddetçe bottle a 's eklemektedir eğer bir adet kalırsa s eklemez.
        loop:while (true) { //while döngüsü başlar

            System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall,");
            System.out.println(n + " bottle" + plural + " of " + stuff + ";");
            System.out.println("You take one down " + "and pass it around:");
            --n;
            plural = (n == 1) ? "" : "s";
            if(n == 0) break loop;
            System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall!\n");

        }
        System.out.println("No bottles of " + stuff + " on the wall!");
    }

    //Bu kod şarkı yazdırılmak için kullanılır
    public static void main(String[] args) {
        printSong("slime",3);
    }
}
