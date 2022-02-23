package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Problem9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputRowCount = sc.nextInt();

        for (int i = 0; i < inputRowCount; i++) {
            Stack<Character> stack = new Stack<>();
            boolean returnValue = false;
            for (char c : sc.next().toCharArray()) {
                if ('(' == c) {
                    stack.push(c);
                } else if (stack.isEmpty()) {
                    returnValue = true;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (!stack.isEmpty() || returnValue) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
