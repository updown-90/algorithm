package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flow","flower", "alight"};
        String res = strs[0];  // 결과로 반환할 접두사를 첫 번째 문자열로 초기화합니다.
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0) {  // str[i] 가 res에 포함되어 있지 않으면
                res = res.substring(0, res.length() - 1);  // 접두사가 다른 문자열과 일치하지 않을 경우, 접두사를 하나씩 줄여나갑니다.
            }
        }
        System.out.println(res);
    }

}
