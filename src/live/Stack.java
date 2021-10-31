package live;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<>();

    public void add(int value) {
        stack.add(value);
    }

    public Integer pop() {
        return stack.remove(stack.size() - 1);
    }

    public void print(){
        for (Integer integer : stack) {
            System.out.print(integer + ",");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        stack.pop();
        stack.pop();
        stack.pop();

    }
}
