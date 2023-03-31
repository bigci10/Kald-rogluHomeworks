package IntroductionToObjectOrientedProgramming.chapter3;

public class Variables {

    public static void main(String[] args) {

        String a ;
        int b;
        double c;
        char d;

        //You cant print without initialized..
        //System.out.println(a+"+" +b+"+"+c+"+"+d);

        a = "A";
        b = 123;
        c = 112;
        d = 'c';

        System.out.println(a + b + c + d);

        {
            int k = 1;
        }
        //System.out.println(k); You cant acces k

        int k ;
        {
            k = 5;
        }

        System.out.println(k);
    }
}
