package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(rec_func(input));
        System.out.println(rec_func2(input));

        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            testList.add(i + 1);
        }

        System.out.println(rec_func3(testList));
    }

    private static int rec_func(int input) {
        if (input > 1) {
            return input * rec_func(input-1);
        } else {
            return 1;
        }
    }

    private static int rec_func2(int input) {
        if (input <= 1) {
            return 1;
        } else {
            return input * rec_func2(input-1);
        }
    }

    private static int rec_func3(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }

        return list.get(0) + rec_func3(new ArrayList<>(list.subList(1, list.size())));
    }

}
