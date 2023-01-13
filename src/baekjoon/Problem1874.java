package baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Problem1874 {

    // 수열이 주어지고 1부터 n까지에 수에 대해 차례로 스택 자료구조를 사용해 해당 수열을 만들수 있는지 없는지 확인하는 문제

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int numberCount = in.nextInt(); // 수열의 개수를 입력받는다

        int[] inputNumbers = new int[numberCount]; // N개의 카드 를 담을 배열 선언

        // N 개의 수를 입력받아서 담는다
        for (int i = 0; i < numberCount; i++) {
            inputNumbers[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // 수열을 담을 스택 생성
        StringBuilder sb = new StringBuilder(); // 마지막 결과값을 출력할 StringBuilder생성

        int index = 0; // 수열의 인덱스를 선언해준다
        for (int i = 0; i < numberCount; i++) { // 입력받은 배열 loop 시작
            stack.push(i + 1); // 스택에 1부터 시작하는 수열을 넣는다
            sb.append("+"); // 스택에 넣었으니 출력값에 + append

            // 스택이 비어있지 않고, 스택의 맨 위 값과 지금 찾는 값이 일치하면
            while (!stack.isEmpty() && stack.peek() == inputNumbers[index]) {
                stack.pop(); // 스택의 맨 위 값을 pop
                sb.append("-");// 스택에서 pop했으니 출력값에 - append
                index++; // 다음 값을 찾기위해 수열의 인덱스 하나 찾아준다
            }
        }

        if (stack.empty()) { // 스택이 다 비워지면 수열이 만들어진거로 판단
            for (char s : sb.toString().toCharArray()) {
                System.out.println(s);
            }
        } else { // 스택이 비어있지 않으면 만들어질 수 없는 수열 NO 출력
            System.out.println("NO");
        }

    }
}
