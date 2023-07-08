package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
//        I 1
//        V 5
//        X 10
//        L 50
//        C 100
//        D 500
//        M 1000


//        I V(5)와 X(10) 앞에 배치하여 4와 9를 만들  수 있습니다 .
//        X L(50)과 (100) 앞에 배치하여 C40과 90을 만들 수 있습니다.
//        C D(500)과 M(1000) 앞에 400과 900을 만들 수 있습니다.

        Map<String, Integer> romanKeyIntegerValue = new HashMap<>();
        romanKeyIntegerValue.put("I", 1);
        romanKeyIntegerValue.put("V", 5);
        romanKeyIntegerValue.put("X", 10);
        romanKeyIntegerValue.put("L", 50);
        romanKeyIntegerValue.put("C", 100);
        romanKeyIntegerValue.put("D", 500);
        romanKeyIntegerValue.put("M", 1000);

        String inputValue = "MCMXCIV";

        int result = 0;
        char[] inputValueToCharArray = inputValue.toCharArray();
        for (int i = 0; i < inputValueToCharArray.length; i++) {

            String convertInputValueCharacterString = String.valueOf(inputValueToCharArray[i]);
            if (i <inputValueToCharArray.length-1 && ( convertInputValueCharacterString.equals("I") || convertInputValueCharacterString.equals("X") || convertInputValueCharacterString.equals("C"))
                    && romanKeyIntegerValue.get(String.valueOf(inputValueToCharArray[i + 1])) > romanKeyIntegerValue.get(convertInputValueCharacterString)) {
                result -= romanKeyIntegerValue.get(convertInputValueCharacterString);
                continue;
            }

            result += romanKeyIntegerValue.getOrDefault(convertInputValueCharacterString, 0);
        }

        System.out.println(result);

    }
}
