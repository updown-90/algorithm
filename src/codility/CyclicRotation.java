package codility;

import java.util.LinkedList;
import java.util.Queue;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = A.length-1; i >= 0; i--) {
            queue.offer(A[i]);
        }

        for (int i = 0; i < K; i++) {
            Integer poll = queue.poll();
            queue.offer(poll);
        }

        int[] returnArray = new int[A.length];
        int index = A.length;
        for (Integer integer : queue) {
            returnArray[index] = integer;
            index--;
        }

        System.out.println(returnArray);
    }
}
