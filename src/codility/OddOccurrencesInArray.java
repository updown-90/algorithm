package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int returnValue;
        for (Integer integer : map.keySet()) {
            if(map.get(integer) == 1){
                returnValue = integer;
            }
        }
    }


}
