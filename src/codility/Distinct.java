package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Distinct {
    public static void main(String[] args) {
    int[] A = {2, 1, 1, 2, 3, 1};
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }

        System.out.println(set.size());
    }


}
