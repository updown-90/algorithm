package leetcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer inputTextCount = sc.nextInt();
        String inputText = sc.next();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < inputTextCount; i++) {
            list.add(inputText.substring(0, 7));
            inputText = inputText.substring(7);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            s = s.replaceAll("#", "1");
            s = s.replaceAll("\\*", "0");
            int decimalValue = Integer.parseInt(s, 2);
            sb.append((char) decimalValue);
        }

        System.out.println(sb);
    }
}


