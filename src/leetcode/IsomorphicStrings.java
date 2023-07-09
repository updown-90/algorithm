package leetcode;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "aaabbbba", t = "bbbaaaab";

        int[] sArr = new int[256];
        int[] tArr = new int[256];

        char pre = '\u0000';
        int count = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == pre) {
                count++;
            } else if (i > 0 && s.charAt(i) != pre) {
                sArr[index] = count;
                index++;
                count = 1;
            }
            pre = s.charAt(i);

            if (i == s.length() - 1) {
                sArr[index] = count;
            }
        }

        pre = '\u0000';
        count = 1;
        index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == pre) {
                count++;
            } else if (i > 0 && t.charAt(i) != pre) {
                tArr[index] = count;
                index++;
                count = 1;
            }
            pre = t.charAt(i);

            if (i == t.length() - 1) {
                tArr[index] = count;
            }
        }

        System.out.println(Arrays.equals(sArr,tArr));

    }

}