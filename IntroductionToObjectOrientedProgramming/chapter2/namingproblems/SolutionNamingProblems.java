package IntroductionToObjectOrientedProgramming.chapter2.namingproblems;

public class SolutionNamingProblems {

    String firstName;

    int calculatePow(int baseVar, int expVar) {
        int result = 1;
        for (int i = 0; i < expVar; i++) {
            result = result * baseVar;
        }

        return result;
    }
}
class NamingTest
{
    public static void main(String[] args) {
        SolutionNamingProblems namingProblems = new SolutionNamingProblems();

        int baseVar = 2;
        int expVar = 4;

        int baseVarOfPowExpVar = namingProblems.calculatePow(baseVar,expVar);

        System.out.println(baseVar + " to the " + expVar + " is " + baseVarOfPowExpVar);
        System.out.println(baseVar + " ^ " + expVar + " is " + baseVarOfPowExpVar);
    }
}


