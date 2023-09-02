package baekjoon;

import java.util.*;

public class Problem1920 {
    private static int searchValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            searchValue = sc.nextInt();
            int result = search(list);
            System.out.println(result);
        }
    }

    private static int search(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int division = list.size() / 2;
        if (list.get(division) == searchValue) {
            return 1;
        } else if (list.get(division) > searchValue) {
            return search(list.subList(0, division));
        } else {
            return search(list.subList(division + 1, list.size()));
        }
    }
}
