package IntroductionToObjectOrientedProgramming.chapter6;

public class StackTest {

    public static void main(String[] args) {

        Stack myStack = new Stack(30);

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");

        myStack.pop();

        myStack.showElements();
    }
}
