package IntroductionToObjectOrientedProgramming.chapter3;

public class Casts {

    public static void main(String[] args) {
        int x = 5;
        //byte b = x ;
        System.out.println(x);
        byte b = (byte) x ;
        System.out.println(b);

        float f = 23.F;
        System.out.println(f);

        long l = (long) f;
        System.out.println(l);

        char c = '5';
        System.out.println(c);

        int i = (int) c;
        System.out.println(i);
    }
}
