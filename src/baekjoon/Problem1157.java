package baekjoon;

import java.util.*;

public class Problem1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (map.get(str) == null) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }

        int val = 0;
        String ans = "";
        for (String key : map.keySet()) {
            if (val == map.get(key)) {
                if (ans.compareTo(key) >= 0) {
                    ans = key;
                }
            } else if (val < map.get(key)) {
                val = map.get(key);
                ans = key;
            }

        }

        System.out.println(ans);

    }
}
