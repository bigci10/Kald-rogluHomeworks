public class Hello {

    private String world = "World";

    public String sayHi(String who)
    {
        String sentence;

        if(who != "")
            sentence = "Hello" + who + ":)";
        else
            sentence = "Hello" + world + ":)";

        return sentence;
    }
}

class HelloTest
{
    public static void main(String[] args) {
        Hello hello = new Hello();

        String answer = hello.sayHi("Mehmet");
        System.out.println(answer);

        answer = hello.sayHi("");
        System.out.println(answer);
    }
}