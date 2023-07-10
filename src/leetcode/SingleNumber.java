package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] num = {4,1,2,1,2};

        for (int i : num) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        int returnValue = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                returnValue = integer;
            }
        }

        System.out.println(returnValue);
    }
}
