package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        String inputValue = "(])";

        for (char c : inputValue.toCharArray()) {
            String bracket = String.valueOf(c);
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals("(") && bracket.equals(")")) {
                        stack.pop();
                    } else if (stack.peek().equals("[") && bracket.equals("]")) {
                        stack.pop();
                    } else if (stack.peek().equals("{") && bracket.equals("}")) {
                        stack.pop();
                    } else {
                        System.out.println(false);
                    }
                } else {
                    System.out.println(false);
                }

            }
        }
        System.out.println(stack.isEmpty());

    }
}
