package codility;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String S = "1";
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 0; j < S.length() - i + 1; j++) {
                Set<Character> lowerSet = new HashSet<>();
                Set<Character> upperSet = new HashSet<>();
                String substringValue = S.substring(j, j + i);
                char[] tempCharArr = substringValue.toCharArray();

                for (char ch : tempCharArr) {
                    if (Character.isLowerCase(ch)) {
                        lowerSet.add(ch);
                    } else if (Character.isUpperCase(ch)) {
                        upperSet.add(ch);
                    }
                }

                List<Character> lowerList = lowerSet.stream().map(Character::toLowerCase).collect(Collectors.toList());
                List<Character> upperList = upperSet.stream().map(Character::toLowerCase).collect(Collectors.toList());
                if (lowerList.containsAll(upperList) && upperList.containsAll(lowerList)) {
                    System.out.println(substringValue.length());
                }
            }
        }
    }
}
