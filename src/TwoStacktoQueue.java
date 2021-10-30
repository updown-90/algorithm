import java.util.Stack;

public class TwoStacktoQueue {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Stack<Integer> inStack = new Stack<>();
        Stack<Integer> outStack = new Stack<>();

        for (Integer value : A) {

            inStack.add(value);
        }

        for (int i = 0; i < A.length; i++) {
            outStack.add(inStack.pop());
        }

        for (Integer value : outStack) {
            System.out.println(value);
        }
    }
}
