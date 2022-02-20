package baekjoon;

public class Problem15596 {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sum(a));
    }

    private static long sum(int[] a) {
        long value = 0L;

        for (long i : a) {
            value += i;
        }

        return value;
    }
}
