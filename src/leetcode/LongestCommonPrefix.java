package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};

        String firstStr = strs[0];
        String returnValue = "";

        if (strs.length == 1) {
            System.out.println(firstStr);
        }

        boolean allStrlengthOne = true;
        for (String str : strs) {
            if(str.length() > 1){
                allStrlengthOne = false;
            };
        }

        if (firstStr.length() == 1 && !allStrlengthOne) {
            System.out.println("");
        }

        for (int j = 0; j < firstStr.length(); j++) {
            String substring = firstStr.substring(0, firstStr.length() - j);

            boolean allDupl = true;
            for (String str : strs) {
                if (!str.contains(substring)) {
                    allDupl = false;
                }
            }

            if (allDupl) {
                returnValue = substring;
                break;
            }
        }


        System.out.println(returnValue);

    }
}
