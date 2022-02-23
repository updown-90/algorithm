package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        for (int i = 0; i < N; i++) {
            if (queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }
            queue.poll();
            queue.add(queue.poll());
        }
    }
}
