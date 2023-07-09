package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        Map<Integer, Integer> map = new HashMap<>();


        for (Integer integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        int maxValue = 0;
        int returnValue = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > maxValue) {
                maxValue = map.get(integer);
                returnValue = integer;
            }
        }

        System.out.println(returnValue);

    }
}
