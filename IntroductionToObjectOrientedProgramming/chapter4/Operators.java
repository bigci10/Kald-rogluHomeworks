package IntroductionToObjectOrientedProgramming.chapter4;

public class Operators {

    public static void main(String[] args) {

        int x = 5;
        System.out.println("x = " + x);

        //+=:Toplama işlemi yapar ve sonucu x'e atar
        x += 3;
        System.out.println("x += 3 " + x);
        //-=:Çıkarma işlemi yapar ve sonucu x'e atar
        x -= 2;
        System.out.println("x -= 2 = " + x);
        //*=:Çarpma işlemi yapar ve sonucu x'e atar
        x *= 2;
        System.out.println("x *= 2 = " + x);
        // /=:Bölme işlemi yapar ve sonucu x'e atar
        x /= 3;
        System.out.println("x /= 3 = " + x);
        // %=:Mod alma işlemi yapar ve sonucu x'e atar
        x %= 3;
        System.out.println("x %= 3 " + x);
        // &=:Bitwise AND işlemi yapar ve sonucu x'e atar
        x &= 2;
        System.out.println("x &= 2 = " + x);
        // |=:Bitwise Or işlemi yapar ve sonucu x'e atar
        x |= 3;
        System.out.println("x |= 3 = " + x);
        // ^=: Bitwise XOR işlemi yapar ve sonucu x'e atar
        x ^= 1;
        System.out.println("x ^= 1 = " + x);
        // <<=: Sol kaydırma işlemi yapar ve sonucu x'e atar
        x <<= 2;
        System.out.println("x <<= 2 = " + x);
        // >>=: Sağ kaydırma işlemi yapar ve sonucu x'e ata
        x >>= 1;
        System.out.println("x >>= 1 = " + x);

        //Binary tabanda sağa doğru bir bit kaydırır ve kaydırılan boşluğa sıfır ekler
        x >>>= 1;
        System.out.println("x >>>= 1 " + x);

    }

}


class ArttirmaEksiltme {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = " + x);

        //ön ek ++ Değişkemim değerini önce arttırır, sonra kullanır
        System.out.println("++x = " + ++x);
        System.out.println("x = " + x);

        //Arka ek ++: Değişkenin değerini önce kullanır, sonra arttırır
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);

        //ön ek --: Değişkenin değerini önce azaltır, sonra kullanır
        System.out.println("--x = " + --x);
        System.out.println("x = " + x);

        //Arka ek --: Değişkenin değerini önce kullanır, sonra azaltır
        System.out.println("x-- = " + x--);
        System.out.println("x = " + x);
    }
}

class NormalSartliIslemciler {

    //Normal şartlı işlemcilerde, ilk koşulun doğru olması durumunda ikinci koşul kontrol edilmezken, kısa devreli şartlı işlemcilerde her iki koşul da kontrol edilir.

    public static void main(String[] args) {

        int a = 5;
        int b = 10;


        if(a > 0 && b > 0)
            System.out.println("a ve b pozitif");

        if(a < 0 || b < 0)
            System.out.println("a veya b negatif");

    }
}

class KısaDevreliSartlıIslemciler {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        if(a > 0 & b > 0)
            System.out.println("a ve b pozitif");

        if(a < 0 | b < 0)
            System.out.println("a veya b negatif");
    }

}



//cardInfo.setIdNo(cardInfo.getTcCitizen() ? (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn()) ?

//        registrationForm.getTckn() : verifyOtpWSResponse.getTckn()):

//        (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno())) ?

//        registrationForm.getTckn(): verifyOtpWSResponse.getCustno());

//if (cardInfo.getTcCitizen()) {
//    if (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn())) {
//        cardInfo.setIdNo(registrationForm.getTckn());
//    }else {
//        cardInfo.setIdNo(verifyOtpWSResponse.getTckn());
//    }
//
//}
//else {
//    if(formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno()))
//        cardInfo.setIdNo(registrationForm.getTckn());
//    else {
//        cardInfo.setIdNo(verifyOtpWSResponse.getCustno());
//    }
//}
