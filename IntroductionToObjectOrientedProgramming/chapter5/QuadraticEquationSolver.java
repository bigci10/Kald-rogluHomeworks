package IntroductionToObjectOrientedProgramming.chapter5;

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        Solve(1,2,4);

    }

    public static void Solve(double a,double b,double c) {

        double delta = b * b - 4 * a * c;

        if(delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("iki farklı gerçek kök var: " + x1 + "ve" + x2);

        }else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("Bir tek gerçek kök var: " + x);
        }else {

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2*a);
            System.out.println("Gerçek kök yok iki karmaşık kök var: "+ realPart + " +i " + imaginaryPart + " ve " + realPart + " - i " + imaginaryPart);
        }

    }
}
